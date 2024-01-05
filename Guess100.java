import java.util.Random;
import java.util.Scanner;

public class Guess100 {
    public Guess100() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int userGuess;
            int attempts = 0;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("\nI've selected a number between 1 and 100. Try to guess it!");

            do {
                System.out.print("Enter your guess: ");  // changed println to print
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");  // corrected the closing quote
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } while (userGuess != targetNumber);

            System.out.print("Do you want to play again? (yes/no): ");  // changed println to print
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes") || playAgainInput.equals("y");
        }

        System.out.println("Thanks for playing! Goodbye.");
    }
}
