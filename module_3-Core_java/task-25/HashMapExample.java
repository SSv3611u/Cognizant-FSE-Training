import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    private static void addStudents(Map<Integer, String> students, Scanner scanner) {
        System.out.print("How many students do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter student id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            students.put(id, name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> students = new HashMap<>();

        addStudents(students, scanner);

        System.out.print("Enter an id to search: ");
        int searchId = scanner.nextInt();

        String name = students.get(searchId);
        if (name == null) {
            System.out.println("No student found with id " + searchId);
        } else {
            System.out.println("Student name: " + name);
        }
    }
}
