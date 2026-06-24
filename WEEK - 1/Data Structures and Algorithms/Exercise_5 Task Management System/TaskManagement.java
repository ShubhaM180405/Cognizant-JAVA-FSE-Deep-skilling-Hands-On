public class TaskManagement{

    private Node head;

    private static class Node{

        Task task;
        Node next;

        Node(Task task){
            this.task = task;
            this.next = null;
        }
    }

    // Add Task
    public void addTask(Task task){

        Node newNode = new Node(task);

        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;

        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    // Search Task
    public Task searchTask(int taskId){

        Node current = head;

        while (current != null){
            if (current.task.getTaskId() == taskId){
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Display Tasks
    public void displayTasks() {

        if (head == null){
            System.out.println("No Tasks Available.");
            return;
        }
        Node current = head;

        while (current != null){
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete Task
    public boolean deleteTask(int taskId) {

        if (head == null){
            return false;
        }

        if (head.task.getTaskId() == taskId){
            head = head.next;
            return true;
        }
        Node current = head;

        while (current.next != null && current.next.task.getTaskId() != taskId){
            current = current.next;
        }

        if (current.next == null){
            return false;
        }
        current.next = current.next.next;

        return true;
    }
}