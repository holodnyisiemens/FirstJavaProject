package timus.task_1837;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<String, List<String>> graph = new HashMap<>();
        Set<String> allPeople = new HashSet<>();

        // читаем команды
        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            String b = scanner.next();
            String c = scanner.next();

            allPeople.add(a);
            allPeople.add(b);
            allPeople.add(c);

            graph.putIfAbsent(a, new ArrayList<>());
            graph.putIfAbsent(b, new ArrayList<>());
            graph.putIfAbsent(c, new ArrayList<>());

            // соединяем всех друг с другом
            graph.get(a).add(b);
            graph.get(a).add(c);
            graph.get(b).add(a);
            graph.get(b).add(c);
            graph.get(c).add(a);
            graph.get(c).add(b);
        }

        // BFS
        Map<String, Integer> dist = new HashMap<>();
        Queue<String> queue = new LinkedList<>();

        if (graph.containsKey("Isenbaev")) {
            queue.add("Isenbaev");
            dist.put("Isenbaev", 0);
            while (!queue.isEmpty()) {
                String current = queue.poll();
                for (String neighbor : graph.get(current)) {
                    if (!dist.containsKey(neighbor)) {
                        dist.put(neighbor, dist.get(current) + 1);
                        queue.add(neighbor);
                    }
                }
            }
        }

        // сортировка по имени
        List<String> result = new ArrayList<>(allPeople);
        Collections.sort(result);

        for (String name : result) {
            if (dist.containsKey(name)) {
                System.out.println(name + " " + dist.get(name));
            } else {
                System.out.println(name + " undefined");
            }
        }
    }
}
