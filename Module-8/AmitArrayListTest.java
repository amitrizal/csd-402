import java.util.ArrayList;
import java.util.Scanner;

public class AmitArrayListTest {
    
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int maxValue = list.get(0);
        for (int num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop and include 0 in the list):");
        while (true) {
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }

        scanner.close();

        int maxNumber = max(numbers);
        System.out.println("The largest number in the list is: " + maxNumber);
    }
}
