public class EmployeeManagement{
    private Employee[] employees;
    private int size;

    public EmployeeManagement(int capacity) {

        employees = new Employee[capacity];
        size = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (size < employees.length){
            employees[size++] = employee;
            System.out.println("Employee has been added successfully.");
        }
        else{
            System.out.println("Array Full!! So cannot Add employee.");
        }
    }

    // Search Employee
    public Employee searchEmployee(int employeeId){

        for (int i = 0; i < size; i++){

            if (employees[i].getEmployeeId() == employeeId){
                return employees[i];
            }
        }
        return null;
    }

    // Traverse Employees
    public void displayEmployees(){

        if (size == 0){
            System.out.println("No Employees Available.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    public boolean deleteEmployee(int employeeId){

        for (int i = 0; i < size; i++){

            if (employees[i].getEmployeeId() == employeeId){

                for (int j = i; j < size - 1; j++){
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
}