import java.util.Scanner;
import java.util.Random;

public class internship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1; 
        int guess;
        int attempts = 0;

        System.out.println("Guess the number (between 1 and 100):");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            } 
            else if (guess < number && number - guess <= 10) {
                System.out.println("Very close! But LOW!");
            } 
            else if (guess > number && guess - number <= 10) {
                System.out.println("Very close! But HIGH!");
            } 
            else if (guess < number) {
                System.out.println("TOO LOW!");
            } 
            else {
                System.out.println("TOO HIGH!");
            }
        }

        input.close();
    }
}
