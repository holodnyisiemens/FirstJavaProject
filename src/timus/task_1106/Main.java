package timus.task_1106;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer>[] friends = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) friends[i] = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            while (true) {
                int x = sc.nextInt();
                if (x == 0) break;
                friends[i].add(x);
            }
        }

        int[] team = new int[N + 1]; // 0 = не распределен, 1 = команда 1, 2 = команда 2

        // Жадное распределение команд
        boolean changed;
        do {
            changed = false;
            for (int i = 1; i <= N; i++) {
                if (team[i] == 0) continue;
                for (int f : friends[i]) {
                    if (team[f] == 0) {
                        team[f] = 3 - team[i]; // противоположная команда
                        changed = true;
                    } else if (team[f] == team[i]) {
                        // конфликт: меняем друга в противоположную команду
                        team[f] = 3 - team[i];
                        changed = true;
                    }
                }
            }
            // ставим оставшихся без команды в команду 1
            for (int i = 1; i <= N; i++) {
                if (team[i] == 0) {
                    team[i] = 1;
                    changed = true;
                }
            }
        } while (changed);

        // Проверка: у каждого есть хотя бы один друг в другой команде
        for (int i = 1; i <= N; i++) {
            boolean ok = false;
            for (int f : friends[i]) {
                if (team[f] != team[i]) {
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println(0);
                return;
            }
        }

        // Формируем первую команду
        List<Integer> team1 = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (team[i] == 1) team1.add(i);
        }

        System.out.println(team1.size());
        for (int x : team1) System.out.print(x + " ");
    }
}