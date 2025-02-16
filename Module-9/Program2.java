import java.io.*;
import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        String fileName = "data.file"; // File name
        Random random = new Random();

        // Writing/Appending 10 random numbers to file
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            System.out.print("Writing numbers: ");
            for (int i = 0; i < 10; i++) {
                Integer num = random.nextInt(100); // Auto-boxing (int to Integer)
                bw.write(num + " ");
                System.out.print(num + " "); // Show numbers being written
            }
            bw.newLine(); // Add a new line after 10 numbers
            System.out.println("\nNumbers written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        // Reading and displaying file contents
        System.out.println("\nReading file contents:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
