/*
 * Author: Amit Rizal
 * Date: 03/07/2025
 * Assignment: Module-12 Yearly Auto Service Calculation
 * Purpose: This program calculates the cost of a yearly auto service visit
 * using method overloading. Each method handles different service options.
 */

public class AutoService {

    // Constants for service charges
    private static final double STANDARD_SERVICE = 150.00;
    private static final double OIL_CHANGE = 40.00;
    private static final double TIRE_ROTATION = 35.00;

    // Method 1: No parameters - returns standard service charge
    public static double yearlyService() {
        return STANDARD_SERVICE;
    }

    // Method 2: One parameter - adds oil change fee
    public static double yearlyService(boolean oilChange) {
        return STANDARD_SERVICE + (oilChange ? OIL_CHANGE : 0);
    }

    // Method 3: Two parameters - adds oil change and tire rotation fee
    public static double yearlyService(boolean oilChange, boolean tireRotation) {
        return STANDARD_SERVICE + (oilChange ? OIL_CHANGE : 0) + (tireRotation ? TIRE_ROTATION : 0);
    }

    // Method 4: Three parameters - includes coupon discount
    public static double yearlyService(boolean oilChange, boolean tireRotation, double coupon) {
        double totalCost = STANDARD_SERVICE + (oilChange ? OIL_CHANGE : 0) + (tireRotation ? TIRE_ROTATION : 0);
        return totalCost - coupon;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Testing each method twice
        System.out.println("Test 1: Standard Service Only: $" + yearlyService());
        System.out.println("Test 2: Standard Service Only: $" + yearlyService());

        System.out.println("Test 3: Service with Oil Change: $" + yearlyService(true));
        System.out.println("Test 4: Service with Oil Change: $" + yearlyService(true));

        System.out.println("Test 5: Service with Oil Change and Tire Rotation: $" + yearlyService(true, true));
        System.out.println("Test 6: Service with Oil Change and Tire Rotation: $" + yearlyService(true, true));

        System.out.println("Test 7: Full Service with $20 Coupon: $" + yearlyService(true, true, 20.00));
        System.out.println("Test 8: Full Service with $50 Coupon: $" + yearlyService(true, true, 50.00));
    }
}
