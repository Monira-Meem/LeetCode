package queue.easy;

import java.util.Stack;

public class QueueUsingStack_232 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueUsingStack_232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

    public int peek(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int top = stack2.peek();

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return top;
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int data = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return data;
    }

}
