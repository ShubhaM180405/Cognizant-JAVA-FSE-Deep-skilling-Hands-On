public class Main{

    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" Employee Management System");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        EmployeeManagement management = new EmployeeManagement(5);

        // Add Employees
        management.addEmployee(new Employee(101, "Shubham", "Software Engineer", 85000));

        management.addEmployee(new Employee(102, "Satyam", "Data Analyst", 65000));

        management.addEmployee(new Employee(103, "Soham", "UI Designer", 55000));

        System.out.println("\nEMPLOYEE RECORDS");
        management.displayEmployees();

        // Search
        System.out.println("\nSEARCHING EMPLOYEE ID 102");
        Employee employee = management.searchEmployee(102);
        if (employee != null){
            System.out.println("Employee Found : " + employee);
        }
        else{
            System.out.println("Employee Not Found.");
        }

        // Delete
        System.out.println("\nDELETING EMPLOYEE ID 103");
        if (management.deleteEmployee(103)){
            System.out.println("Employee Deleted Successfully.");
        }
        else{
            System.out.println("Employee Not Found.");
        }

        System.out.println("\nUPDATED EMPLOYEE RECORDS");
        management.displayEmployees();

        System.out.println("\nProgram Executed Successfully.");
    }
}