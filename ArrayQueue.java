import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int count1;
    private int count2;
    private int index;

    public ArrayQueue(int capacity) {
        if (capacity == 0)
            throw new IllegalStateException("Capacity must be 1 or greater");
        this.queue = new int[capacity];
        //this.count1 = capacity;
        this.count1 = 0;
        this.count2 = 0;
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException("Queue is full");
        queue[count1++] = item;
        // index++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new StackOverflowError("Queue is empty");
        return queue[count2++];
   }


    public int peek(){
        return queue[count2];
    }

    private boolean isFull() {
        return count1 == queue.length;
    }

    private boolean isEmpty() {
        return count1 == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(queue, 0, index);
        return Arrays.toString(content);
    }
}