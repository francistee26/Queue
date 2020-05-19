import java.util.Arrays;

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
        int i = shift(item);
        items[i+1] = item;
        count++;
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException("Queue is empty");
        return items[count2++];
    }

    private int shift(int item) {
        int i;
        for (i = count-1; i>=0; i-- ){
            if(items[i] > item)
                items[i+1] = items[i];
        else
            break;
        }
        return i;
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