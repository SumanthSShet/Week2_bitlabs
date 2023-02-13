import java.util.Scanner;

class Main7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter basic salary: ");
    float basicSalary = scanner.nextFloat();
    
    float hra = (89 * basicSalary) / 100;
    float da = (90 * basicSalary) / 100;
    float grossSalary = basicSalary + hra + da;
    
    System.out.println("Gross salary: " + grossSalary);
  }
}