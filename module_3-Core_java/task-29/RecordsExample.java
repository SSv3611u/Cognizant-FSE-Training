import java.util.List;

record Person(String name, int age) {
}

public class RecordsExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Asha", 24),
                new Person("Nikhil", 17),
                new Person("Meera", 31)
        );

        System.out.println("All people:");
        people.forEach(System.out::println);

        System.out.println("Adults:");
        people.stream()
                .filter(person -> person.age() >= 18)
                .forEach(System.out::println);
    }
}
