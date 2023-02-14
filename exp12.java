import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int evenCount = 0, oddCount = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num /= 10;
        }

        System.out.println("The number of even digits in the given number is " + evenCount);
        System.out.println("The number of odd digits in the given number is " + oddCount);
    }
}
