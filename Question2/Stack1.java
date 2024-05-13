package Question2;
public class Stack1{
    private static final int MAX_SIZE = 133;
    private int[] arr;
    private int Top;

    public Stack1() {
        arr = new int[MAX_SIZE];
        Top = -1;
    }

    public boolean isEmpty() {
        if (Top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return Top == MAX_SIZE - 1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("The stack is already full do not try to puch");
            return;
        }

        arr[++Top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[Top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[Top];
    }

    public static void main(String[] args) {
        Dsa.Stack1 stack = new Dsa.Stack1();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Choosed Item: " + stack.peek());
    }
}


