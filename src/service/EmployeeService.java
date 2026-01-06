package service;
import dao.EmployeeDAO;
import model.Employee;
import java.util.List;

public class EmployeeService {

    private final EmployeeDAO dao = new EmployeeDAO();

    public void addEmployee(Employee emp) {
        boolean result = dao.addEmployee(emp);
        if (result) {
            System.out.println("Employee added successfully..");
        } else {
            System.out.println("Failed to add employee..");
        }
    }
    public void showAllEmployees() {
        List<Employee> list = dao.getAllEmployees();
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}