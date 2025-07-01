
public class CustomStack {
    private int[] stack;
    private int top;

    public CustomStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (!isFull()) {
            stack[++top] = val;
        } else {
            System.out.println("Stack is Full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }
}
