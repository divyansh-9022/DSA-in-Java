public class StackUsingArray {

    int[] stack;
    int top;

    StackUsingArray(int size) {
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(stack[top--] + " popped");
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();

        stack.display();
    }
}
