public class PQMain {
    public static void main(String[] args) {
        PriorityQueue pQueue = new PriorityQueue(5);
        pQueue.add(2);
        pQueue.add(3);
        pQueue.add(1);
        System.out.println(pQueue);

        while(!pQueue.isEmpty())
            System.out.println(pQueue.remove());
    }
}