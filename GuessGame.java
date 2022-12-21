import java.util.Random; 
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("\t\t***Lets start the game***");
        int secretNumber;
        int userGuess;
        int guessCount = 0;
        boolean correct = false;
        try (Scanner keyboard = new Scanner(System.in)) {
            int maxNumber = 100;
            int minNumber = 1;
            Random randomNumber = new Random();
            secretNumber = minNumber + randomNumber.nextInt(maxNumber);
            System.out.println("Enter your guess(1-100):");
            while(!correct) {
            userGuess = keyboard.nextInt(); 
             if(userGuess == secretNumber) {
                correct = true;
                System.out.println("Correct..!.YOU WIN..!");
                System.out.println("It took you " +guessCount+ " guess/guesses!");
                } 
            else if (userGuess < secretNumber){
                System.out.println("GUESS HIGHER");
                guessCount++;
                } 
            else if (userGuess > secretNumber) {
                System.out.println("GUESS LOWER");
                guessCount++;
                }


            }
        }

    }
}