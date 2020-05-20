import java.util.Arrays;
import java.util.Stack;

public class PriorityQueue {
    private int[] items;
    private int count;
    private int count2;
    public PriorityQueue(int capacity) {
        this.items = new int[capacity];
        this.count = 0;
        this.count2 = 0;
    }

    public void add(int item){
        if(isFull())
            resize();
        int i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException("Queue is empty");
        var val = items[count2];
        items[count2++] = 0;
        return val;
    }

    public int[] reverseQueueToKth(int k){
        Stack<Integer> stack = new Stack<>();
        for(int i = k-1; i >= 0; i--)
            stack.push(remove());

        for(int j = 0; j < k; j++)
            items[j] = stack.pop();
        return items; 
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count-1; i>=0; i-- ){
            if(items[i] > item)
                items[i+1] = items[i];
        else
            break;
        }
        return i+1;
    }

    private int[] resize(){
        int[] newItems = new int[count*2];
        for(int i = 0; i < count; i++)
            newItems[i] = items[i];
        items=newItems;
        return items;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    private boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}