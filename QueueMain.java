public class QueueMain {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(40);
        // queue.dequeue();
       // queue.peek()
        System.out.println(queue.peek());
        //System.out.println(queue.peek());
    }
}