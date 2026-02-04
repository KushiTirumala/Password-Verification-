import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordVerifier {

    // Method to check password validity
    public static boolean isValidPassword(String password) {
        // Minimum 8 characters, at least one uppercase, one lowercase, one number, one special character
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return Pattern.matches(passwordPattern, password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password to verify:");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println(" Password is valid!");
        } else {
            System.out.println(" Invalid password. Make sure it has:");
            System.out.println("- Minimum 8 characters");
            System.out.println("- At least one uppercase letter");
            System.out.println("- At least one lowercase letter");
            System.out.println("- At least one number");
            System.out.println("- At least one special character (@$!%*?&)");
        }

        scanner.close();
    }
}
