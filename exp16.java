import java.util.Scanner;
class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = scanner.nextInt();

        int reversed = 0, original = num;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /=10;
        }
      if(original == reversed){
        System.out.println("the given number is a palindrome");
      }else{
        System.out.println("the given number is not a palindrome");
      }
    }
}
        
    
