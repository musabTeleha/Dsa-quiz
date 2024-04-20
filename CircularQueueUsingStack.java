import java.util.Stack;

public class CircularQueueUsingStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> tempStack;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueueUsingStack(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        this.mainStack = new Stack<>();
        this.tempStack = new Stack<>();
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (rear == capacity - 1)
            rear = -1;

        mainStack.push(item);
        size++;
        rear++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (front == capacity)
            front = 0;

        size--;
        return mainStack.get(front++);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularQueueUsingStack queue = new CircularQueueUsingStack(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());

        queue.enqueue(60);
        queue.enqueue(70);

        while (!queue.isEmpty())
            System.out.println("Dequeued item: " + queue.dequeue());
    }
}
