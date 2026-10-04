public class DeleteNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    void delete(int value) {
        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteNode list = new DeleteNode();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Before deletion:");
        list.display();

        list.delete(30);

        System.out.println("After deleting 30:");
        list.display();
    }
}
