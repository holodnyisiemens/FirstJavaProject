package lab8.xmlTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class XMLParser {

    private static final String FILE_PATH = "src/lab8/xmlTask/products.xml";

    public static void main(String[] args) {
        try {
            Document doc = readDocument(FILE_PATH);
            doc.getDocumentElement().normalize();

            printProducts(doc, "Исходный список продуктов");

            addProductIfAbsent(doc, "Клавиатура", "10", "4500");

            saveDocument(doc, FILE_PATH);

            printProducts(doc, "После добавления продукта");

            System.out.println("\nПоиск продуктов с количеством '5':");
            findProducts(doc, "5", null).forEach(XMLParser::printProduct);

            if (deleteProductByName(doc, "Мышь беспроводная")) {
                saveDocument(doc, FILE_PATH);
                System.out.println("\nПродукт удален из XML-файла.");
            }

            printProducts(doc, "После удаления продукта");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Document readDocument(String filePath) throws Exception {
        File inputFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        return dBuilder.parse(inputFile);
    }

    private static void printProducts(Document doc, String title) {
        System.out.println("\n" + title);
        System.out.println("Корневой элемент: "
                + doc.getDocumentElement().getNodeName());

        getProductElements(doc).forEach(XMLParser::printProduct);
    }

    private static void printProduct(Element element) {
        System.out.println("\nТекущий элемент: product");
        System.out.println("Название: "
                + element.getElementsByTagName("name").item(0).getTextContent());
        System.out.println("Количество: "
                + element.getElementsByTagName("quantity").item(0).getTextContent());
        System.out.println("Стоимость: "
                + element.getElementsByTagName("price").item(0).getTextContent());
    }

    private static List<Element> getProductElements(Document doc) {
        NodeList nodeList = doc.getElementsByTagName("product");
        List<Element> products = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                products.add((Element) node);
            }
        }

        return products;
    }

    private static List<Element> findProducts(Document doc, String quantity, String price) {
        return getProductElements(doc).stream()
                .filter(product -> quantity == null ||
                        quantity.equalsIgnoreCase(
                                product.getElementsByTagName("quantity")
                                        .item(0)
                                        .getTextContent()))
                .filter(product -> price == null ||
                        price.equals(
                                product.getElementsByTagName("price")
                                        .item(0)
                                        .getTextContent()))
                .collect(Collectors.toList());
    }

    private static void addProduct(Document doc, String name, String quantity, String price) {
        Element product = doc.createElement("product");

        appendTextElement(doc, product, "name", name);
        appendTextElement(doc, product, "quantity", quantity);
        appendTextElement(doc, product, "price", price);

        doc.getDocumentElement().appendChild(product);
    }

    private static void addProductIfAbsent(Document doc, String name, String quantity, String price) {
        boolean exists = getProductElements(doc).stream()
                .anyMatch(product -> name.equalsIgnoreCase(
                        product.getElementsByTagName("name")
                                .item(0)
                                .getTextContent()));

        if (!exists) {
            addProduct(doc, name, quantity, price);
        }
    }

    private static void appendTextElement(Document doc, Element parent, String tagName, String value) {
        Element element = doc.createElement(tagName);
        element.appendChild(doc.createTextNode(value));
        parent.appendChild(element);
    }

    private static boolean deleteProductByName(Document doc, String name) {
        for (Element product : getProductElements(doc)) {
            String currentName = product.getElementsByTagName("name").item(0).getTextContent();

            if (name.equalsIgnoreCase(currentName)) {
                product.getParentNode().removeChild(product);
                return true;
            }
        }
        return false;
    }

    private static void saveDocument(Document doc, String filePath) throws Exception {
        doc.setXmlStandalone(true);
        doc.normalizeDocument();

        javax.xml.transform.Transformer transformer =
                javax.xml.transform.TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
        transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");

        javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
        javax.xml.transform.stream.StreamResult result =
                new javax.xml.transform.stream.StreamResult(new File(filePath));
        transformer.transform(source, result);
    }
}