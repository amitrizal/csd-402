import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(
            "Inception", "Titanic", "Avatar", "The Godfather", "The Dark Knight",
            "Forrest Gump", "Gladiator", "Interstellar", "Jurassic Park", "The Matrix"
        ));
        
        // Printing the movie list using for-each loop
        for (String movie : stringList) {
            System.out.println(movie);
        }
        
        // Getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the movie you want to see again (0-9): ");
        try {
            Integer index = scanner.nextInt(); // Auto-boxing (int to Integer)
            System.out.println("You selected: " + stringList.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}
