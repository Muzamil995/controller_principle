package without_controller_principle;

// Model and View combined in the Main class
public class MVCDemoWithoutController {

    // Inner class representing the model (User)
    static class User {
        private String username;
        private String password;

        // Constructor
        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // Method to validate user credentials
        public boolean isValid(String inputUsername, String inputPassword) {
            return this.username.equals(inputUsername) && this.password.equals(inputPassword);
        }
    }

    // Inner class representing the view (LoginView)
    static class LoginView {
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

    // Main method where the model and view are directly managed
    public static void main(String[] args) {
        // Create the model (User)
        User user = new User("admin", "password123");

        // Create the view (LoginView)
        LoginView view = new LoginView();

        // Simulate user input and login process without a separate controller
        view.displayLoginPrompt();

        // Handle login directly in the main method
        String inputUsername = "admin";
        String inputPassword = "password123"; // Test with correct credentials

        if (user.isValid(inputUsername, inputPassword)) {
            view.displaySuccessMessage();
        } else {
            view.displayFailureMessage();
        }

        // Test with incorrect credentials
        inputPassword = "wrongpassword";

        if (user.isValid(inputUsername, inputPassword)) {
            view.displaySuccessMessage();
        } else {
            view.displayFailureMessage();
        }
    }
}

