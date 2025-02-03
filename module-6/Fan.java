/**
 * Amit Rizal
 * Date: 02/01/2025
 * Assignment: CSD-402 Module 6 - Fan Class Implementation
 * Purpose: This program defines a Fan class with various attributes and methods,
 *          including constants for speed, setters and getters, constructors, 
 *          and a toString() method. A test program demonstrates its functionality.
 */

public class Fan {
    // Constants for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * No-argument constructor that sets default values
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    /**
     * Constructor with arguments
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * toString method to return the Fan's state
     */
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", Color: " + color + ", Radius: " + radius + " (Fan is ON)";
        } else {
            return "Fan color: " + color + ", Radius: " + radius + " (Fan is OFF)";
        }
    }

    /**
     * Test program
     */
    public static void main(String[] args) {
        // Creating default fan instance
        Fan defaultFan = new Fan();
        System.out.println("Default Fan:");
        System.out.println(defaultFan);

        // Creating a fan with specific values
        Fan customFan = new Fan(FAST, true, 10, "blue");
        System.out.println("\nCustom Fan:");
        System.out.println(customFan);
    }
}
