/*
 * Author: [Your Name]
 * Date: [Submission Date]
 * Assignment: CSD-402 Module 3
 * Purpose: This program uses nested for loops to generate a specific pattern of numbers
 *          and includes an '@' symbol at the end of each row.
 */

public class NestedLoopsPattern {
    public static void main(String[] args) {
        // Number of rows in the pattern
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int space = 0; space < (rows - i - 1) * 2; space++) {
                System.out.print(" ");
            }

            // Print numbers in ascending order
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2;
            }

            // Print numbers in descending order
            value /= 2;
            for (int j = 0; j < i; j++) {
                value /= 2;
                System.out.print(value + " ");
            }

            // Print the '@' symbol at the end of the row
            System.out.println("@");
        }
    }
}
