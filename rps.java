import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Rock, paper, or scissors");
        String userChoice = sc.nextLine();
        int computerChoice = rand.nextInt(3) + 1;

        if (userChoice.equalsIgnoreCase("rock")) {
            if (computerChoice == 1) {
                System.out.println("The computer chose rock. It's a tie");
            } else if (computerChoice == 2) {
                System.out.println("The computer chose paper. You lose");
            } else {
                System.out.println("The computer chose scissors. You win");
            }
        } else if (userChoice.equalsIgnoreCase("paper")) {
            if (computerChoice == 1) {
                System.out.println("The computer chose rock. You win");
            } else if (computerChoice == 2) {
                System.out.println("The computer chose paper. It's a tie");
            } else {
                System.out.println("The computer chose scissors. You lose");
            }
        } else if (userChoice.equalsIgnoreCase("scissors")) {
            if (computerChoice == 1) {
                System.out.println("The computer chose rock. You lose");
            } else if (computerChoice == 2) {
                System.out.println("The computer chose paper. You win");
            } else {
                System.out.println("The computer chose scissors. It's a tie");
            }
        } else {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
        }
    }
}
