public class Main{

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" MVC Pattern Example");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        Student student = new Student("Shubham Bej", 106, "A+");

        StudentView view =new StudentView();

        StudentController controller = new StudentController(student, view);

        System.out.println("\nFollowing are the initial Student Details\n");

        controller.updateView();

        System.out.println("\nUpdating Student Record...\n");

        controller.setStudentName("Shubham Sangram Bej");

        controller.setStudentGrade("S");

        controller.setStudentId(007);

        System.out.println("Following are the updated Student Details\n");

        controller.updateView();

        System.out.println("\nMVC Pattern Executed Successfully.");
    }
}