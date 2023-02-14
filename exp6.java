//1. WAP to find factors of a given number 
import java.util.Scanner;
 
class Example1 {
  public static void main(String args[]) {
 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number to find factors");
    int num=s.nextInt();   // 50  --> 25       1- num/2
 
    for(int i=1;i<=num/2;i++){
      if(num%i==0){      // 50/25
        System.out.println(i);
      }
    }
    
    
  }
}


