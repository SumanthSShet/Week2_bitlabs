/*
  2*1=2
2*2=4
2*3=6
  */
 
import java.util.Scanner;
 
class Example1 {
  public static void main(String args[]) {
 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your number to print a table");
    int num = s.nextInt(); // 3 5
 
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " * " + i + " =" + (num * i));
    }
  }
}