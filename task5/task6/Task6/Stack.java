
public class Stack {
    private int[] stack;
    private int top;

    public Stack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top < stack.length - 1) {
            stack[++top] = element;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack Underflow");
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

    public int size() {
        return top + 1;
    }
}