import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Method to update a task description
    public void updateTask(int position, String newDescription) {
        if (position < 0 || position >= tasks.size()) {
            System.out.println("Invalid position. Please try again.");
        } else {
            tasks.set(position, newDescription);
            System.out.println("Task at position " + position + " updated to: " + newDescription);
        }
    }

    // Method to remove a task by its position
    public void removeTask(int position) {
        if (position < 0 || position >= tasks.size()) {
            System.out.println("Invalid position. Please try again.");
        } else {
            String removedTask = tasks.remove(position);
            System.out.println("Task removed: " + removedTask);
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String task = scanner.nextLine();
                    taskManager.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter the position of the task to update: ");
                    int updatePos = scanner.nextInt() - 1;  // -1 to match zero-based index
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter the new task description: ");
                    String newDescription = scanner.nextLine();
                    taskManager.updateTask(updatePos, newDescription);
                    break;
                case 3:
                    System.out.print("Enter the position of the task to remove: ");
                    int removePos = scanner.nextInt() - 1;  // -1 to match zero-based index
                    taskManager.removeTask(removePos);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
