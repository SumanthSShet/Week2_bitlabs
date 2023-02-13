import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter salary: ");
    float salary = scanner.nextFloat();
    
    System.out.print("Enter bill amount for shopping 1: ");
    float bill1 = scanner.nextFloat();
    
    System.out.print("Enter bill amount for shopping 2: ");
    float bill2 = scanner.nextFloat();
    
    System.out.print("Enter bill amount for shopping 3: ");
    float bill3 = scanner.nextFloat();
    
    float totalShoppingAmount = bill1 + bill2 + bill3;
    float percentage = (totalShoppingAmount / salary) * 100;
    
    System.out.println("Total shopping amount: " + totalShoppingAmount);
    System.out.println("Percentage of salary spent on shopping: " + percentage + "%");
  }
}

    
