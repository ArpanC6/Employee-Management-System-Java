package auth;

import exception.InvalidInputException;

public class LoginService {

    public void login(String username, String password)
            throws InvalidInputException {

        if (username == null || username.trim().isEmpty()) {
            throw new InvalidInputException("Username cannot be empty..");
        }

        if (password == null || password.trim().isEmpty()) {
            throw new InvalidInputException("Password cannot be empty..");
        }

        if (username.length() < 3) {
            throw new InvalidInputException("Username must be at least 3 characters..");
        }

        if (password.length() < 4) {
            throw new InvalidInputException("Password must be at least 4 characters..");
        }

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login successful..");
        } else {
            throw new InvalidInputException("Invalid username or password..");
        }
    }
}