/**
 * Author: Amit Rizal
 * Date: 01/19/2024
 * Assignment: Rock-Paper-Scissors Game 
 * CSD-402 Module-2
 * Purpose: This program simulates the popular game Rock-Paper-Scissors. It randomly generates the computer's choice, prompts the user for their choice, and displays the outcome of the game.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Initialize Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate the computer's selection (1 = Rock, 2 = Paper, 3 = Scissors)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt the user for their choice
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors.");
        int userChoice = scanner.nextInt();

        // Validate user input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please run the program again and select 1, 2, or 3.");
            return;
        }

        // Display both choices
        System.out.println("Computer's choice: " + getChoiceName(computerChoice));
        System.out.println("Your choice: " + getChoiceName(userChoice));

        // Determine and display the result
        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }

    // Method to get the name of the choice
    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Unknown";
        }
    }

    // Method to determine the winner
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        }

        if ((userChoice == 1 && computerChoice == 3) ||
            (userChoice == 2 && computerChoice == 1) ||
            (userChoice == 3 && computerChoice == 2)) {
            return "Congratulations! You win!";
        } else {
            return "Sorry, you lose. Better luck next time!";
        }
    }
}
