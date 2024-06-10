package tasksoop;
import java.util.Scanner;
import tasksoop.manager.TaskManager;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager objTaskManager = new TaskManager();
        boolean exit = true;
        while (exit) {
            System.out.println("\n¿What action do you want to perform?");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Mark Task as Complete");
            System.out.println("5. Go out");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            exit = objTaskManager.userInteraction(option);
            //scanner.close();
        }
    }
}