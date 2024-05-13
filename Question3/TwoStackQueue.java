package Question3;
public class TwoStackQueue {
    private static final int MAX_SIZE = 100;
    private int[] stack1;
    private int[] stack2;
    private int top1;
    private int top2;

    public TwoStackQueue() {
        stack1 = new int[MAX_SIZE];
        stack2 = new int[MAX_SIZE];
        top1 = -1;
        top2 = -1;
    }

    public boolean isEmpty() {
        return top1 == -1 && top2 == -1;
    }

    public boolean isFull() {
        return top1 + top2 == MAX_SIZE - 2;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        while (top1 >= 0) {
            stack2[++top2] = stack1[top1--];
        }

        stack1[++top1] = item;

        while (top2 >= 0) {
            stack1[++top1] = stack2[top2--];
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stack1[top1--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stack1[top1];
    }

    public static void main(String[] args) {
        Dsa.TwoStackQueue queue = new Dsa.TwoStackQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());

        System.out.println("Peeked item: " + queue.peek());
    }
}


