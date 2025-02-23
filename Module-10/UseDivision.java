// UseDivision.java
// Main application to create and display division instances
public class UseDivision {
    public static void main(String[] args) {
        // Creating instances of InternationalDivision
        InternationalDivision intlDiv1 = new InternationalDivision("Europe Division", 1001, "Germany", "German");
        InternationalDivision intlDiv2 = new InternationalDivision("Asia Division", 1002, "Japan", "Japanese");

        // Creating instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Division", 2001, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Division", 2002, "California");

        // Displaying division details
        intlDiv1.display();
        intlDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
