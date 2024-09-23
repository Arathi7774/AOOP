package employeedirectory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeDirectory {
    private Map<Integer, Employee> employeeMap;

    public EmployeeDirectory() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    public Employee getEmployee(int id) {
        return employeeMap.get(id);
    }

    public Set<Employee> getAllEmployees() {
        return new HashSet<>(employeeMap.values());
    }

    public void removeEmployee(int id) {
        employeeMap.remove(id);
    }
}
