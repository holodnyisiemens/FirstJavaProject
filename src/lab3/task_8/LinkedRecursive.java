package lab3.task_8;

import java.util.Scanner;

public class LinkedRecursive {
    private Node head = null;
    private final Scanner sc = new Scanner(System.in);

    public void createHeadRec(int count) {
        if (count <= 0) return;
        System.out.print("Значение: ");
        head = new Node(sc.nextInt(), head);
        createHeadRec(count - 1);
    }

    public void createTailRec(int count) {
        if (count <= 0) return;
        System.out.print("Значение: ");
        int val = sc.nextInt();
        if (head == null) head = new Node(val, null);
        else addLastRecursive(head, val);
        createTailRec(count - 1);
    }

    private void addLastRecursive(Node current, int val) {
        if (current.next == null) {
            current.next = new Node(val, null);
            return;
        }
        addLastRecursive(current.next, val);
    }

    public String toStringRec() {
        return toStringHelper(head);
    }

    private String toStringHelper(Node current) {
        if (current == null) return "null";
        return current.value + " -> " + toStringHelper(current.next);
    }

    public static void main(String[] args) {
        LinkedRecursive list = new LinkedRecursive();
        System.out.println("--- ТЕСТ РЕКУРСИИ ---");
        System.out.print("Введите кол-во элементов для createTailRec: ");
        int n = new Scanner(System.in).nextInt();
        list.createTailRec(n);
        System.out.println("Список: " + list.toStringRec());
    }
}