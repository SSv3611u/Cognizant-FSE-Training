import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
                
        while (true) {
            System.out.print("Enter student name: ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            
            if (!input.isEmpty()) {
                studentNames.add(input);
            } else {
                System.out.println("Name cannot be empty. Please try again.");
            }
        }
        
        System.out.println("\nFinal List of Students");
        if (studentNames.isEmpty()) {
            System.out.println("No student names were entered.");
        } else {
            for (int i = 0; i < studentNames.size(); i++) {
                System.out.println((i + 1) + ". " + studentNames.get(i));
            }
        }
    }
}
