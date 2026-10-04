public class QueueUsingArray {

    int[] queue;
    int front;
    int rear;

    QueueUsingArray(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = value;
        System.out.println(value + " inserted");
    }

    void dequeue() {

        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(queue[front++] + " removed");
    }

    void peek() {

        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element: " + queue[front]);
    }

    void display() {

        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue:");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueUsingArray queue = new QueueUsingArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        queue.peek();

        queue.dequeue();

        queue.display();
    }
}
