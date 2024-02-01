import java.io.Console;
import java.util.Scanner;
//creating  login program class
public class LoginProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "george";
        String password = "george123";
        int attempts = 3;
//creating instances on attempts made
        while (attempts > 0) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = hidePasswordInput(scanner);
// logic programing
            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid username or password. Please try again.");
                attempts--;
                if (attempts > 0) {
                    System.out.println("You have " + attempts + " attempts left.");
                } else {
                    System.out.println("No attempts left. Please contact support.");
                }
            }
        }
        scanner.close();
    }

    private static String LoginProgram(Scanner scanner) {
        return null;
    }

    // Method to hide password input with asterisks
    private static String hidePasswordInput(Scanner scanner) {
        Console console = System.console();
        if (console == null) {
            return scanner.nextLine();
        }
        char[] passwordChars = console.readPassword();
        return new String(passwordChars);
    }
}
