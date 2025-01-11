
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// edited by khaled
public class TaskManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        System.out.println("Welcome to Simple To-Do List!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Edit Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask(scanner, tasks);
                    break;
                case 2:
                    viewTasks(tasks);
                    break;
                case 3:
                    editTask(scanner, tasks);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addTask(Scanner scanner, List<String> tasks) {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    private static void viewTasks(List<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Khaled's function
    private static void editTask(Scanner scanner, List<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available to edit.");
            return;
        }

        System.out.print("Entertheof the task you want to edit: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            System.out.print("Enter the new task: ");
            String newTask = scanner.nextLine();
            tasks.set(taskNumber - 1, newTask);
            System.out.println("Task updated successfully.");
        }
    }
}




