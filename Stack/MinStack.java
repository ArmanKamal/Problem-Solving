package Stack;
import java.util.*;
public class MinStack {
    Stack<Integer> stack = new Stack();
    Stack<Integer> min_stack = new Stack();
    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);
        if(min_stack.isEmpty() || val<=min_stack.peek()){
            min_stack.push(val);
        }
    }

    public void pop() {
        if(stack.pop().equals(min_stack.peek())){
            System.out.println("Came here");
            min_stack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
