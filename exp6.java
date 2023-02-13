import java.util.Scanner;
 class Main6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter first value: ");
    int value1 = scanner.nextInt();
    
    System.out.print("Enter second value: ");
    int value2 = scanner.nextInt();
    
    int sum = value1 + value2;
    System.out.println("Sum: " + sum);
  }
}
