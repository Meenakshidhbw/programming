import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "yes";
        
        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice;
        String computerChoice; 

        do{
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();
        
        if (!playerChoice.equals("rock") && 
            !playerChoice.equals("paper") && 
            !playerChoice.equals("scissors")) {
            System.out.println("Invalid Input");
        } else {
            computerChoice = choices[random.nextInt(3)].toLowerCase();
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
                       (playerChoice.equals("paper") && computerChoice.equals("rock")) || 
                       (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");
            }
        }
            
        System.err.println("Play again(yes/no): ");
        playAgain = scanner.nextLine().toLowerCase(); 
       } while(playAgain.equals("yes")); 


       System.out.println("Thank you for playing");         
        scanner.close();
    }   
}
