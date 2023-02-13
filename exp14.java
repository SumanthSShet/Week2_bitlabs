import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();

        double bill = 0.0;
        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = 50 * 0.50 + (units - 50) * 1.23;
        } else if (units <= 250) {
            bill = 50 * 0.50 + 100 * 1.23 + (units - 150) * 1.90;
        } else {
            bill = 50 * 0.50 + 100 * 1.23 + 100 * 1.90 + (units - 250) * 2.34;
        }

        System.out.println("Total bill amount: " + bill);
    }
}
