package View;
public class LoginView {
    public void displayLoginPrompt() {
        System.out.println("Please enter your username and password:");
    }

    public void displaySuccessMessage() {
        System.out.println("Login successful!");
    }

    public void displayFailureMessage() {
        System.out.println("Login failed. Please try again.");
    }
}