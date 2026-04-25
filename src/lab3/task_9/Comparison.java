package lab3.task_9;

import java.util.*;

public class Comparison {
    private static final int SIZE = 2_000_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();

        fill(arrayList);
        fill(linkedList);
        fill(sortedSet);

        System.out.println("=== ДОБАВЛЕНИЕ ===");
        testAddFirst(arrayList, linkedList);
        testAddLast(arrayList, linkedList);
        testAddMiddle(arrayList, linkedList);

        System.out.println("\n=== УДАЛЕНИЕ ===");
        testRemoveFirst(arrayList, linkedList);
        testRemoveLast(arrayList, linkedList);
        testRemoveMiddle(arrayList, linkedList);

        System.out.println("\n=== ДОСТУП ПО ИНДЕКСУ ===");
        testGet(arrayList, linkedList);

        System.out.println("\n=== SortedSet ===");
        testSortedSet(sortedSet);
    }

    static void fill(Collection<Integer> c) {
        for (int i = 0; i < SIZE; i++) {
            c.add(i);
        }
    }

    static void testAddFirst(List<Integer> a, List<Integer> l) {
        System.out.println("Добавление В НАЧАЛО:");
        System.out.println("  ArrayList  = " + measure(() -> a.add(0, -1)) + " ms");
        System.out.println("  LinkedList = " + measure(() -> l.add(0, -1)) + " ms");
    }

    static void testAddLast(List<Integer> a, List<Integer> l) {
        System.out.println("Добавление В КОНЕЦ:");
        System.out.println("  ArrayList  = " + measure(() -> a.add(-1)) + " ms");
        System.out.println("  LinkedList = " + measure(() -> l.add(-1)) + " ms");
    }

    static void testAddMiddle(List<Integer> a, List<Integer> l) {
        System.out.println("Добавление В СЕРЕДИНУ:");
        System.out.println("  ArrayList  = " + measure(() -> a.add(a.size()/2, -1)) + " ms");
        System.out.println("  LinkedList = " + measure(() -> l.add(l.size()/2, -1)) + " ms");
    }

    static void testRemoveFirst(List<Integer> a, List<Integer> l) {
        System.out.println("Удаление В НАЧАЛЕ:");
        System.out.println("  ArrayList  = " + measure(() -> a.remove(0)) + " ms");
        System.out.println("  LinkedList = " + measure(() -> l.remove(0)) + " ms");
    }

    static void testRemoveLast(List<Integer> a, List<Integer> l) {
        System.out.println("Удаление В КОНЦЕ:");
        System.out.println("  ArrayList  = " + measure(() -> a.remove(a.size()-1)) + " ms");
        System.out.println("  LinkedList = " + measure(() -> l.remove(l.size()-1)) + " ms");
    }

    static void testRemoveMiddle(List<Integer> a, List<Integer> l) {
        System.out.println("Удаление В СЕРЕДИНЕ:");
        System.out.println("  ArrayList  = " + measure(() -> a.remove(a.size()/2)) + " ms");
        System.out.println("  LinkedList = " + measure(() -> l.remove(l.size()/2)) + " ms");
    }

    static void testGet(List<Integer> a, List<Integer> l) {
        Random rand = new Random();

        System.out.println("Получение ПО ИНДЕКСУ:");

        System.out.println("  ArrayList  = " + measure(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                a.get(rand.nextInt(a.size()));
            }
        }) + " ms");

        System.out.println("  LinkedList = " + measure(() -> {
            for (int i = 0; i < 100_000; i++) {
                l.get(rand.nextInt(l.size()));
            }
        }) + " ms");
    }

    static void testSortedSet(SortedSet<Integer> set) {
        System.out.println("Добавление: " + measure(() -> set.add(-1)));
        System.out.println("Удаление: " + measure(() -> set.remove(-1)));
        System.out.println("Поиск: " + measure(() -> set.contains(1000)));
    }

    static long measure(Runnable task) {
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        return (end - start) / 1_000_000; // ms
    }

}
