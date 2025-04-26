import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("Rules:");
        System.out.println("- The computer has selected a random number between 1 and 100.");
        System.out.println("- If your guess is more than 10 away from the number: 'Cold'");
        System.out.println("- If your guess is within 10 (plus or minus) from the number: 'Hot'");
        System.out.println("- You have unlimited attempts. Good luck!\n");

        int numberToGuess = random.nextInt(100) + 1; // random number between 1 and 100
        int guess;

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number correctly!");
                break; // exit the loop
            } else if (Math.abs(guess - numberToGuess) <= 10) {
                System.out.println("Hot");
            } else {
                System.out.println("Cold");
            }
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
