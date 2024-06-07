package tasksoop.manager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    public int index;
    public String task;
    public boolean s;
    private List<String> tasks = new ArrayList<>();
    
    Scanner scanner = new Scanner(System.in);
          
            public boolean userInteraction(int option) {
                switch (option) {
                    case 1:
                        System.out.print("Enter the new task: ");
                        String newTask = scanner.nextLine();
                        addTask(newTask); s = true;
                        break;
                    case 2:
                        System.out.print("Enter the index of the task to delete: ");
                        int indexDelete = scanner.nextInt();
                        removeTask(indexDelete); 
                        break; 
                    case 3:
                        listTask();
                        break; 
                        
                     case 4:
                        System.out.print("Enter the index of the completed task: ");
                        int indexCompleted = scanner.nextInt();
                        taskCompleted(indexCompleted); 
                        break;
                     case 5:
                        System.out.println("¡bye bye!"); 
                        s = false; 
                        return s; 
                    default:
                        System.out.println("Invalid option. Try again."); 
                        break;
                }
               return s; 
            }
        
            public void addTask(String task) {
                tasks.add(task);
                System.out.println("Task added successfully.");
            }
            
            public void listTask() {
                System.out.println("Things to do:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println(i + ". " + tasks.get(i));
                }
            }

            public void removeTask(int index) { 
                if (index >= 0 && index < tasks.size()) {
                    tasks.remove(index);
                    System.out.println("Task deleted successfully.");
                } else {
                    System.out.println("Invalid index. The task does not exist.");
                }
            }
            public void taskCompleted(int index) { 
                if (index >= 0 && index < tasks.size()) {
                    tasks.set(index, "[COMPLETED] " + tasks.get(index));
                    System.out.println("Task marked as completed.");
                } else {
                    System.out.println("Invalid index. The task does not exist.");
                }
            }
         
}
