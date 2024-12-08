import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Demonstrate Array Behavior
        System.out.println("Array Demonstration:");
        String[] array = new String[3]; // Fixed size
        array[0] = "A";
        array[1] = "B";
        array[2] = "C";
        System.out.println("Original Array: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
        // Adding an element requires creating a new array (manually resize)

        // Demonstrate ArrayList Behavior
        System.out.println("ArrayList Demonstration:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("Original ArrayList: " + arrayList);
        arrayList.add("D"); // Dynamic resizing
        System.out.println("ArrayList after adding an element: " + arrayList);
        arrayList.remove("B");
        System.out.println("ArrayList after removing an element: " + arrayList);
    }
}