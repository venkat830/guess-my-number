import java.util.Random;
import java.util.Scanner;

public class Guessmynumber {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        // Initialize the number of tries
        int numberOfTries = 0;

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess My Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (true) {
            // Ask the user for their guess
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            // Increment the number of tries
            numberOfTries++;

            // Check if the guess is correct
            if (guess == numberToGuess) {
                System.out.println(" Congratulations! You guessed the number in " + numberOfTries + " tries.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Your guess is too high. Try again!");
            }
        
        }
        scanner.close();
    }
}


    

