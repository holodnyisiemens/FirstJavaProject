package lab8.xmlTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class CreateXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();

            Element rootElement = doc.createElement("products");
            doc.appendChild(rootElement);

            Element product1 = doc.createElement("product");
            rootElement.appendChild(product1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("Ноутбук"));
            product1.appendChild(name1);

            Element quantity1 = doc.createElement("quantity");
            quantity1.appendChild(doc.createTextNode("5"));
            product1.appendChild(quantity1);

            Element price1 = doc.createElement("price");
            price1.appendChild(doc.createTextNode("75000"));
            product1.appendChild(price1);

            Element product2 = doc.createElement("product");
            rootElement.appendChild(product2);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("Мышь беспроводная"));
            product2.appendChild(name2);

            Element quantity2 = doc.createElement("quantity");
            quantity2.appendChild(doc.createTextNode("15"));
            product2.appendChild(quantity2);

            Element price2 = doc.createElement("price");
            price2.appendChild(doc.createTextNode("2300"));
            product2.appendChild(price2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();

            javax.xml.transform.TransformerFactory transformerFactory =
                    javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer =
                    transformerFactory.newTransformer();

            transformer.setOutputProperty(
                    javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(
                    javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(
                    javax.xml.transform.OutputKeys.INDENT, "yes");

            javax.xml.transform.dom.DOMSource source =
                    new javax.xml.transform.dom.DOMSource(doc);

            // Изменен путь к файлу на products.xml
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(
                            new File("src/lab8/xmlTask/products.xml"));

            transformer.transform(source, result);

            System.out.println("XML-файл с продуктами успешно создан!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}