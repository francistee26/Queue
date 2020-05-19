import java.util.Arrays;
import java.util.Stack;

public class QueueAsStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public QueueAsStack() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue (int item) {
        stack1.push(item);
    }

    public int dequeue (){
        if(isEmpty())
            throw new IllegalStateException("Queue is Empty");
        moveStack1ToStack2();
        return stack2.pop();
    }

    
    public int peek(){
        if(isEmpty())
        throw new IllegalStateException("Queue is Empty");
        moveStack1ToStack2();
        return stack2.peek();
    }
    
    private void moveStack1ToStack2() {
        if(stack2.empty())
            while(!stack1.empty())
                stack2.push(stack1.pop());
    }
    
    private boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public String toString(){
        return Arrays.toString(stack2.toArray());
    }
    
}