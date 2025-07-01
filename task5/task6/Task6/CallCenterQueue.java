
import java.util.Scanner;

public class CallCenterQueue {
    private String[] calls;
    private int front, rear, size;

    public CallCenterQueue(int capacity) {
        calls = new String[capacity];
        front = rear = size = 0;
    }

    public void addCall(String caller) {
        if (size == calls.length) {
            System.out.println("Call queue is full.");
            return;
        }
        calls[rear] = caller;
        rear = (rear + 1) % calls.length;
        size++;
    }

    public void serveCall() {
        if (size == 0) {
            System.out.println("No pending calls.");
            return;
        }
        System.out.println("Handling call from: " + calls[front]);
        front = (front + 1) % calls.length;
        size--;
    }

    public void displayCalls() {
        System.out.print("Current Call Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(calls[(front + i) % calls.length] + " ");
        }
        System.out.println();
    }

    public void displayPending() {
        System.out.println("Pending calls: " + size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallCenterQueue q = new CallCenterQueue(5);
        while (true) {
            System.out.println("\n1. Add Call\n2. Serve Call\n3. Display Calls\n4. Display Pending\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter caller ID/name: ");
                    q.addCall(sc.nextLine());
                }
                case 2 -> q.serveCall();
                case 3 -> q.displayCalls();
                case 4 -> q.displayPending();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
