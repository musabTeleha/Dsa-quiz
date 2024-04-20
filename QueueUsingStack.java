import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int x) {
        // Move all elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Push item into stack1
        stack1.push(x);

        // Push everything back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        // If both stacks are empty then the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Return top of stack1
        return stack1.pop();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Front item: " + queue.peek());
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

