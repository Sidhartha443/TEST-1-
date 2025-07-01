
import java.util.Scanner;

public class SupermarketQueue {
    private String[] queue;
    private int front, rear, size;

    public SupermarketQueue(int capacity) {
        queue = new String[capacity];
        front = rear = size = 0;
    }

    public void addCustomer(String name) {
        if (size == queue.length) {
            System.out.println("Queue is full.");
            return;
        }
        queue[rear] = name;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public void serveCustomer() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Serving: " + queue[front]);
        front = (front + 1) % queue.length;
        size--;
    }

    public void displayQueue() {
        System.out.print("Current Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }

    public void displayCount() {
        System.out.println("Number of customers: " + size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SupermarketQueue q = new SupermarketQueue(5);
        while (true) {
            System.out.println("\n1. Add Customer\n2. Serve Customer\n3. Display Queue\n4. Display Count\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter customer name: ");
                    q.addCustomer(sc.nextLine());
                }
                case 2 -> q.serveCustomer();
                case 3 -> q.displayQueue();
                case 4 -> q.displayCount();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
