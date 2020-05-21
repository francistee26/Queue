import java.util.ArrayList;
import java.util.Arrays;

public class LinkedLstQueue {
    public class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedLstQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int item) {
        var node = new Node(item);
        if (isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;

    }

    public void addToFront(int item){
        var node = new Node(item);
        if(isEmpty()){
            head =  tail = node;
        }
        else{
            var newNode = node;
            newNode.next = head;
            head = newNode;
        }
    }

    public int dequeue() {
        int value;
        if(head == tail){
            value = head.value;
            head = tail = null;
        }
        else{
            value = head.value;
            var second = head.next;
            head.next = null;
            head = second;
        }

        size--;
        return value;
    }

    public int peek() {
        var current = head;
        return current.value;
    }

    // public int[] toArray() {
    //     items = new int[size];
    //     var current = head;
    //     int count = 0;
    //     while (current != null) {
    //         items[count++] = current.value;
    //         current = current.next;
    //     }
    //     return items;
    // }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();

        Node current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list.toString();
    }

}