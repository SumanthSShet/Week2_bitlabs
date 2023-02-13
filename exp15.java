import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basic = sc.nextDouble();

        double hra = 0.0;
        double da = 0.0;
        if (basic < 10000) {
            hra = 0.67 * basic;
            da = 0.78 * basic;
        } else if (basic >= 10000 && basic < 20000) {
            hra = 0.70 * basic;
            da = 0.80 * basic;
        } else {
            hra = 0.73 * basic;
            da = 0.87 * basic;
        }

        double gross = basic + hra + da;
        System.out.println("Gross salary: " + gross);
    }
}
