public class Employee {

    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;

    public Employee(int employeeId, String employeeName, String designation, double salary){

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getDesignation(){
        return designation;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {

        return "ID : " + employeeId + " | Name : " + employeeName + " | Position : " + designation + " | Salary : Rs." + salary;
    }
}