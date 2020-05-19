public class QueueStack {
    public static void main(String[] args) {
        QueueAsStack qStack = new QueueAsStack();
        qStack.enqueue(10);
        qStack.enqueue(20);
        System.out.println(qStack.dequeue());
        System.out.println(qStack);
    }
}