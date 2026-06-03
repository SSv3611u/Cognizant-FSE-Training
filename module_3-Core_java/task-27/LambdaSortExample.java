import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Anita");
        names.add("Zoya");
        names.add("Kiran");

        Collections.sort(names, (first, second) -> first.compareToIgnoreCase(second));

        System.out.println("Sorted names: " + names);
    }
}
