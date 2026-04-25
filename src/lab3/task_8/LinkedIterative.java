package lab3.task_8;

import java.util.Scanner;

public class LinkedIterative {
    private Node head = null;
    private final Scanner sc = new Scanner(System.in);

    public void createHead() {
        System.out.print("Сколько элементов (ввод с головы)? ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Значение: ");
            addFirst(sc.nextInt());
        }
    }

    public void createTail() {
        System.out.print("Сколько элементов (ввод с хвоста)? ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Значение: ");
            addLast(sc.nextInt());
        }
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) temp = temp.next;
        if (temp != null) temp.next = new Node(value, temp.next);
    }

    public void removeFirst() {
        if (head != null) head = head.next;
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) temp = temp.next;
        if (temp != null && temp.next != null) temp.next = temp.next.next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value).append(" -> ");
            temp = temp.next;
        }
        return sb.append("null").toString();
    }

    public static void main(String[] args) {
        LinkedIterative list = new LinkedIterative();
        System.out.println("--- ТЕСТ ЦИКЛОВ ---");
//        list.createTail();
        list.createHead();
        list.insert(777, 1);
        System.out.println("Результат: " + list.toString());
        list.removeLast();
        System.out.println("Без последнего: " + list.toString());
    }
}