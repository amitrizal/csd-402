/**
 * Module-4: AverageCalculator Assignment
 * Author: Amit Rizal
 * Date: 01/24/2024	
 * Course: CSD-402
 * Assignment: Module 4 Programming Assignment
 * Purpose: To create four overloaded methods to calculate the average of arrays of different types
 * (short, int, long, double) and to test these methods with arrays of different sizes.
 */

public class AverageCalculator {

    /**
     * Calculates the average of a short array.
     * @param array The array of short values.
     * @return The average as a short.
     */
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num; // Add each element
        }
        return (short) (sum / array.length); // Return the average as short
    }

    /**
     * Calculates the average of an int array.
     * @param array The array of int values.
     * @return The average as an int.
     */
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // Add each element
        }
        return sum / array.length; // Return the average as int
    }

    /**
     * Calculates the average of a long array.
     * @param array The array of long values.
     * @return The average as a long.
     */
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num; // Add each element
        }
        return sum / array.length; // Return the average as long
    }

    /**
     * Calculates the average of a double array.
     * @param array The array of double values.
     * @return The average as a double.
     */
    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num; // Add each element
        }
        return sum / array.length; // Return the average as double
    }

    public static void main(String[] args) {
        // Test arrays of different sizes and types
        short[] shortArray = {10, 20, 30};
        int[] intArray = {15, 25, 35, 45};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Display and test short array
        System.out.print("Short array: ");
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray) + "\n");

        // Display and test int array
        System.out.print("Int array: ");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray) + "\n");

        // Display and test long array
        System.out.print("Long array: ");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray) + "\n");

        // Display and test double array
        System.out.print("Double array: ");
        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    /**
     * Displays the elements of a short array.
     * @param array The short array.
     */
    public static void displayArray(short[] array) {
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Displays the elements of an int array.
     * @param array The int array.
     */
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Displays the elements of a long array.
     * @param array The long array.
     */
    public static void displayArray(long[] array) {
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Displays the elements of a double array.
     * @param array The double array.
     */
    public static void displayArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
