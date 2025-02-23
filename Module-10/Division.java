// Division.java
// Abstract class representing a company's division
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor to initialize divisionName and accountNumber
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}
