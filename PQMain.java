import java.util.Arrays;

public class PQMain {
    public static void main(String[] args) {
        PriorityQueue pQueue = new PriorityQueue(5);
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(30);
        pQueue.add(40);
        pQueue.add(50);
        var arr = pQueue.reverseQueueToKth(3);

        System.out.println(Arrays.toString(arr));
    }

}