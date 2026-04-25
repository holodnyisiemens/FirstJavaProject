package lab3.task_7;

public class HeadList {
    public static void main(String[] args) {
        Node head = null;

        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        // вывод списка
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
