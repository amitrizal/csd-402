/**
 * Amit Rizal
 * Date: 01/31/2025
 * Assignment: Module 5 - Locate Largest and Smallest Elements in a 2D Array
 * Purpose: This program contains methods to find the location of the largest
 *          and smallest elements in a given 2D array of integers or doubles.
 */

public class LocateLargestSmallest {

    /**
     * Locates the largest element in a 2D double array.
     * @param arrayParam the 2D array to search
     * @return a one-dimensional array containing the row and column indices of the largest element
     */
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the largest element in a 2D int array.
     * @param arrayParam the 2D array to search
     * @return a one-dimensional array containing the row and column indices of the largest element
     */
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the smallest element in a 2D double array.
     * @param arrayParam the 2D array to search
     * @return a one-dimensional array containing the row and column indices of the smallest element
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the smallest element in a 2D int array.
     * @param arrayParam the 2D array to search
     * @return a one-dimensional array containing the row and column indices of the smallest element
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Main method to test the locateLargest and locateSmallest methods.
     */
    public static void main(String[] args) {
        int[][] intArray = {
            {3, 5, 9},
            {1, 8, 2},
            {6, 4, 7}
        };
        
        double[][] doubleArray = {
            {3.2, 5.1, 9.7},
            {1.8, 8.6, 2.4},
            {6.5, 4.3, 7.9}
        };

        int[] largestIntLocation = locateLargest(intArray);
        int[] smallestIntLocation = locateSmallest(intArray);
        int[] largestDoubleLocation = locateLargest(doubleArray);
        int[] smallestDoubleLocation = locateSmallest(doubleArray);

        System.out.println("Largest int location: [" + largestIntLocation[0] + ", " + largestIntLocation[1] + "]");
        System.out.println("Smallest int location: [" + smallestIntLocation[0] + ", " + smallestIntLocation[1] + "]");
        System.out.println("Largest double location: [" + largestDoubleLocation[0] + ", " + largestDoubleLocation[1] + "]");
        System.out.println("Smallest double location: [" + smallestDoubleLocation[0] + ", " + smallestDoubleLocation[1] + "]");
    }
}
