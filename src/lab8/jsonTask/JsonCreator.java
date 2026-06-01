package lab8.jsonTask;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsonCreator {
    public static void main(String[] args) {
        JSONObject productsObject = new JSONObject();
        JSONArray products = new JSONArray();

        JSONObject product1 = new JSONObject();
        product1.put("name", "Ноутбук");
        product1.put("quantity", "5");
        product1.put("price", "75000");

        JSONObject product2 = new JSONObject();
        product2.put("name", "Мышь беспроводная");
        product2.put("quantity", "15");
        product2.put("price", "2000");

        products.add(product1);
        products.add(product2);

        productsObject.put("products", products);

        try (FileWriter file = new FileWriter("src/lab8/jsonTask/products.json")) {
            file.write(productsObject.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}