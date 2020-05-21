public class SQMain {

    public static void main(String[] args) {
        StackQueue sQueue = new StackQueue();
        sQueue.push(10);
        sQueue.push(20);
        sQueue.push(30);
        // sQueue.pop();
        // sQueue.pop();
        // sQueue.pop();
        System.out.println(sQueue.peek());
        System.out.println(sQueue);
    }

}