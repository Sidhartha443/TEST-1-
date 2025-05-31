// 1
import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is a Composite number.");
    }
}



// public class Ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int factorial = 1;
//         for (int i = 1; i <= num; i++) {
//             factorial *= i;
//         

//         System.out.println("Factorial of " + num + " is: " + factorial);
//     }
// }

// public class Ques1 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("x");
//             }
//             System.out.println();
//         }
//     }
// }
