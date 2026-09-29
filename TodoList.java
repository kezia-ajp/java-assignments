import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create an ArrayList of tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Add tasks
        tasks.add("Finish Java assignment");
        tasks.add("Go grocery shopping");
        tasks.add("Read a book");

        // Display tasks
        System.out.println("My To-Do List:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        // Remove a task
        tasks.remove("Go grocery shopping");

        // Display updated list
        System.out.println("\nAfter removing a task:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
