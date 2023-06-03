package games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        int secretNumber, guess;
        int attempts = 0;
        boolean correctGuess = false;

        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (!correctGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                correctGuess = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low. Try again!");
            } else {
                System.out.println("Too high. Try again!");
            }
        }

        scanner.close();
    }
}

