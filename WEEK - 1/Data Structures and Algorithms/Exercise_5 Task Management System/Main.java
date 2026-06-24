public class Main{

    public static void main(String[] args){

        System.out.println("====================================");
        System.out.println(" Task Management System");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("====================================");

        TaskManagement taskManager = new TaskManagement();

        // Add Tasks
        taskManager.addTask(new Task(101, "Complete DSA Daily Assessment", "Pending"));
        taskManager.addTask(new Task(102, "Complete Aptitude Daily Assessment", "Completed"));
        taskManager.addTask(new Task(103, "Complete Cognizant Java Hands-On", "Pending"));

        System.out.println("\nTASK LIST");
        taskManager.displayTasks();

        // Search Task
        System.out.println("\nSEARCHING FOR TASK ID 103");
        Task foundTask = taskManager.searchTask(103);
        if (foundTask != null){
            System.out.println("Task Found : " + foundTask);
        }
        else{
            System.out.println("Task Not Found.");
        }

        // Delete Task
        System.out.println("\nDELETING TASK ID 102");

        if (taskManager.deleteTask(102)){
            System.out.println("Task Deleted Successfully.");
        }
        else{

            System.out.println("Task Not Found.");
        }

        System.out.println("\nUPDATED TASK LIST");
        taskManager.displayTasks();

        System.out.println("\nProgram Executed Successfully.");
    }
}