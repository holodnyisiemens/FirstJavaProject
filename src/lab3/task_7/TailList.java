package lab3.task_7;

public class TailList {
    public static void main(String[] args) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < 10; i++) {
            Node newNode = new Node(i, null);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
