import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int top;

    public StackQueue() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public void push(int item) {
        queue1.add(item);
        top = item;

    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();
        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }

        swapQueues();

        return queue2.remove();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        return top;
    }

    private void swapQueues() {
        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int size() {
        return queue1.size();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    @Override
    public String toString() {
        return queue1.toString();
    }
}