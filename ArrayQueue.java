import java.util.Arrays;


public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int capacity) {
        if (capacity == 0)
            throw new IllegalStateException("Capacity must be 1 or greater");
        this.queue = new int[capacity];
        this.count = 0;
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException("Queue is full");
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty())
        throw new StackOverflowError("Queue is empty");
        var item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return item;
   }


    public int peek(){
        return queue[front];
    }

    private boolean isFull() {
        return count == queue.length;
    }

    private boolean isEmpty() {
        return rear == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}