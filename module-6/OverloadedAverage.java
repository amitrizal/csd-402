/**
 * Amit Rizal
 * Date: 02/01/2025
 * Assignment: CSD-402 Module 4 - Overloaded Average Methods
 * Purpose: This program demonstrates method overloading by calculating the average
 *          of arrays of different data types: short, int, long, and double.
 */

public class OverloadedAverage {
    
    // Method to calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }
    
    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    // Test Program
    public static void main(String[] args) {
        short[] shortArray = {5, 10, 15, 20};
        int[] intArray = {10, 20, 30, 40, 50};
        long[] longArray = {100L, 200L, 300L, 400L, 500L, 600L};
        double[] doubleArray = {5.5, 10.5, 15.5, 20.5, 25.5, 30.5, 35.5};
        
        System.out.println("Array Contents and Averages:");
        System.out.println("------------------------------------------------");
        displayArray("Short Array", shortArray);
        System.out.println("Average: " + average(shortArray));
        
        displayArray("Int Array", intArray);
        System.out.println("Average: " + average(intArray));
        
        displayArray("Long Array", longArray);
        System.out.println("Average: " + average(longArray));
        
        displayArray("Double Array", doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }
    
    // Generic method to display array contents
    public static void displayArray(String label, Object array) {
        System.out.print(label + ": ");
        if (array instanceof short[]) {
            for (short num : (short[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof int[]) {
            for (int num : (int[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof long[]) {
            for (long num : (long[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof double[]) {
            for (double num : (double[]) array) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
