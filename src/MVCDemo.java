import Controller.LoginController;
import Model.User;
import View.LoginView;

public class MVCDemo {
    public static void main(String[] args) {
        // Create the model (User)
        User user = new User("admin", "password123");

        // Create the view (LoginView)
        LoginView view = new LoginView();

        // Create the controller (LoginController)
        LoginController controller = new LoginController(user, view);

        // Simulate user input and login process
        view.displayLoginPrompt();
        controller.login("admin", "password123"); // Test with correct credentials
        controller.login("admin", "wrongpassword"); // Test with incorrect credentials
    }
}
