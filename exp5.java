import java.util.Scanner;

class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int n, i, evenSum = 0, oddSum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of even numbers between 1 and " + n + " is: " + evenSum);
        System.out.println("Sum of odd numbers between 1 and " + n + " is: " + oddSum);
    }
}
