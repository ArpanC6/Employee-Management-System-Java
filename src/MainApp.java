import model.Employee;
import service.EmployeeService;
import util.ValidationUtil;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Employee Management System ====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    if (!ValidationUtil.isValidEmail(email)) {
                        System.out.println("Invalid email format..");
                        break;
                    }

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    if (!ValidationUtil.isValidSalary(salary)) {
                        System.out.println("Invalid salary..");
                        break;
                    }

                    Employee emp = new Employee(id, name, email, salary);
                    service.addEmployee(emp);
                    break;

                case 2:
                    service.showAllEmployees();
                    break;

                case 3:
                    System.out.println("Application closed..");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice..");
            }
        }
    }
}