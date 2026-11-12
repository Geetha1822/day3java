
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        // Display ArrayList
        System.out.println("ArrayList: " + list);

        // Access element
        System.out.println("First Element: " + list.get(0));

        // Update element
        list.set(1, "Grapes");
        System.out.println("After Update: " + list);

        // Remove element
        list.remove("Mango");
        System.out.println("After Remove: " + list);

        // Find size
        System.out.println("Size: " + list.size());

        // Traverse ArrayList
        System.out.println("Elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
