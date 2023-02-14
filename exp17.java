import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num, remainder, result = 0;
        int n = String.valueOf(num).length();

        while (original != 0) {
            remainder = original % 10;
            result += Math.pow(remainder, n);
            original /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
