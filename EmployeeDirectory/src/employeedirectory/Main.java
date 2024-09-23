package employeedirectory;


public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Adding employees
        directory.addEmployee(new Employee(1, "Alice Johnson", "HR"));
        directory.addEmployee(new Employee(2, "Bob Smith", "IT"));
        directory.addEmployee(new Employee(3, "Charlie Brown", "Finance"));

        // Retrieving an employee
        System.out.println("Employee with ID 1: " + directory.getEmployee(1));

        // Listing all employees
        System.out.println("\nAll Employees:");
        for (Employee employee : directory.getAllEmployees()) {
            System.out.println(employee);
        }

        // Removing an employee
        directory.removeEmployee(2);
        System.out.println("\nAfter removing employee with ID 2:");
        for (Employee employee : directory.getAllEmployees()) {
            System.out.println(employee);
        }
    }
}
