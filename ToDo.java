import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); 
        int choice; 

        System.out.println("Welcome to the To-Do List Manager!");

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);  
                    System.out.println("Task added successfully!");
                    break; 

                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("Your to-do list is empty!");
                    } else {
                        System.out.println("Your tasks:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break; 

                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("Your to-do list is empty! Nothing to remove."); 
                    } else {
                        System.out.println("Your tasks:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                        System.out.print("Enter the task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                            String removedTask = toDoList.remove(taskNumber - 1); 
                            System.out.println("Task '" + removedTask + "' removed successfully!");
                        } else {
                            System.out.println("Invalid task number!");  
                        }
                    }
                    break; 

                case 4:
                    System.out.println("Exiting the To-Do List Manager. Have a productive day!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}


