package lab8.jsonTask;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class JsonParser {

    private static final String FILE_PATH = "src/lab8/jsonTask/products.json";

    public static void main(String[] args) {
        try {
            JSONObject jsonObject = readJson(FILE_PATH);
            JSONArray jsonArray = (JSONArray) jsonObject.get("products");

            printProducts(jsonObject, "Исходный список продуктов");

            addProductIfAbsent(jsonArray, "Клавиатура", "10", "4500");

            writeJson(jsonObject, FILE_PATH);

            printProducts(jsonObject, "После добавления продукта");

            System.out.println("\nПоиск продуктов с количеством '5':");
            findProductsByQuantity(jsonArray, "5");

            if (deleteProductByName(jsonArray, "Мышь беспроводная")) {
                writeJson(jsonObject, FILE_PATH);
                System.out.println("\nПродукт удален из JSON-файла.");
            }

            printProducts(jsonObject, "После удаления продукта");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONObject readJson(String filePath) throws Exception {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(filePath));
        return (JSONObject) obj;
    }

    private static void writeJson(JSONObject jsonObject, String filePath) throws Exception {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonObject.toJSONString());
        }
    }

    private static void printProducts(JSONObject jsonObject, String title) {
        System.out.println("\n" + title);
        System.out.println("Корневой элемент: "
                + jsonObject.keySet().iterator().next());

        JSONArray jsonArray = (JSONArray) jsonObject.get("products");

        for (Object o : jsonArray) {
            printProduct((JSONObject) o);
        }
    }

    private static void printProduct(JSONObject product) {
        System.out.println("\nТекущий элемент: product");
        System.out.println("Название: " + product.get("name"));
        System.out.println("Количество: " + product.get("quantity"));
        System.out.println("Стоимость: " + product.get("price"));
    }

    private static void findProductsByQuantity(JSONArray jsonArray, String quantity) {
        for (Object item : jsonArray) {
            if (item instanceof JSONObject) {
                JSONObject product = (JSONObject) item;

                if (quantity.equals(product.get("quantity"))) {
                    printProduct(product);
                }
            }
        }
    }

    private static void addProduct(JSONArray jsonArray, String name, String quantity, String price) {
        JSONObject newProduct = new JSONObject();

        newProduct.put("name", name);
        newProduct.put("quantity", quantity);
        newProduct.put("price", price);

        jsonArray.add(newProduct);
    }

    private static void addProductIfAbsent(JSONArray jsonArray, String name, String quantity, String price) {
        for (Object item : jsonArray) {
            if (item instanceof JSONObject) {
                JSONObject product = (JSONObject) item;

                if (name.equals(product.get("name"))) {
                    return;
                }
            }
        }

        addProduct(jsonArray, name, quantity, price);
    }

    private static boolean deleteProductByName(JSONArray jsonArray, String name) {
        Iterator<?> iterator = jsonArray.iterator();

        while (iterator.hasNext()) {
            JSONObject product = (JSONObject) iterator.next();

            if (name.equals(product.get("name"))) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}