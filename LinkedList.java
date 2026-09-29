import java.util.LinkedList;

public class {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        // Add elements
        tasks.add("Study Java");
        tasks.add("Complete assignment");
        tasks.add("Go shopping");

        // Access an element
        System.out.println("First task: " + tasks.getFirst());
        System.out.println("Second task: " + tasks.get(1));

        // Remove first element
        tasks.removeFirst();

        // Remove last element
        tasks.removeLast();

        // Display remaining elements
        System.out.println("Remaining tasks:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
