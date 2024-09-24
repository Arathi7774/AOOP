import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("grape");

        // Sort the list of strings in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Alternatively, you can use the Comparator.reverseOrder() method with a method reference
        // strings.sort(Comparator.reverseOrder());

        // Print the sorted list
        System.out.println(strings);
    }
}
