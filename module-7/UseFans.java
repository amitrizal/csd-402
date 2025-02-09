/**
 * Amit Rizal
 * Date: 01/08/2025
 * Assignment: Module 7 - UseFans
 * Purpose: This program demonstrates the use of the Fan class by creating a collection of Fan instances,
 *          displaying them without using the toString() method, and utilizing 'this' references in the Fan class.
 */

import java.util.ArrayList;
import java.util.List;

// Fan class
class Fan {
    // Constants for speed levels
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default constructor
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    // Parameterized constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters with 'this' reference
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// UseFans class
public class UseFans {

    // Method to display a collection of Fan instances without using toString()
    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    // Method to display a single Fan instance without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        // Creating a collection of Fan instances
        List<Fan> fanCollection = new ArrayList<>();
        fanCollection.add(new Fan(Fan.FAST, true, 10.0, "yellow"));
        fanCollection.add(new Fan(Fan.MEDIUM, false, 7.5, "green"));
        fanCollection.add(new Fan(Fan.SLOW, true, 5.0, "blue"));

        // Display all fans in the collection
        displayFans(fanCollection);
    }
}
