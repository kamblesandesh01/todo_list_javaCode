import java.util.ArrayList;

import java.util.Scanner;
public class ToDo {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("****To-Do List-Project****");
        System.out.println("Tasks : add, view, remove, exit");
        while (true) {
            System.out.print("Enter Task :");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added.");
                    System.out.println("Operation Complete");
                    break;

                case "view":
                    System.out.println("Your tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case "remove":
                    System.out.print("Enter task number to remove: ");
                    int index = Integer.parseInt(scanner.nextLine()) - 1;
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Task removed.");
                        System.out.println("Operation Complete");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case "exit":
                    System.out.println("Goodbye!, THANKYOU");
                    System.out.println("Execution Complete");
                    return;

                default:
                    System.out.println("Entered Out-of-the-box comanad, try again");
            }
        }
    }
}
