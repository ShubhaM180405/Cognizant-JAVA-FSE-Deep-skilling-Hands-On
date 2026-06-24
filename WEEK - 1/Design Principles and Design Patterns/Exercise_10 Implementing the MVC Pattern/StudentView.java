public class StudentView{

    public void displayStudentDetails(
            String studentName,
            int studentId,
            String studentGrade
    ){

        System.out.println("-----------------------------");
        System.out.println(" Student Information");
        System.out.println("-----------------------------");
        System.out.println("Name  : " + studentName);
        System.out.println("ID    : " + studentId);
        System.out.println("Grade : " + studentGrade);
        System.out.println("-----------------------------");
    }
}