import java.util.Stack;

public class LinearQueueUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public LinearQueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int x) {
        // Simply push the item onto stack1
        stack1.push(x);
    }

    public int dequeue() {
        // If both stacks are empty then the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // If stack2 is empty, move all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Return top of stack2
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // If stack2 is empty, move all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        LinearQueueUsingStack queue = new LinearQueueUsingStack();
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
