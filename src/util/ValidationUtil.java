package util;
public class ValidationUtil {

    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public static boolean isValidSalary(double salary) {
        return salary > 0;
    }
}