package lab3.task_5;
import java.util.Map;
import java.util.HashMap;
public class HashMapTask {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "alex");
        map.put(1, "tom");
        map.put(2, "sasha");
        map.put(3, "ted");
        map.put(4, "sam");
        map.put(5, "kate");
        map.put(6, "sally");
        map.put(7, "bob");
        map.put(8, "evgeny");
        map.put(9, "andrew");
        System.out.println("ключ больше 5 у: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }
        System.out.print("ключ равен 0 у: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                System.out.print(entry.getValue() + ", ");
            }
        }
        int keys_product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                keys_product *= entry.getKey();
            }
        }
        System.out.println("произведение ключей: " + keys_product);
    }
}