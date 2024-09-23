package Controller;

import Model.User;
import View.LoginView;

public class LoginController {
    private User user;
    private LoginView view;

    // Constructor to initialize the model and view
    public LoginController(User user, LoginView view) {
        this.user = user;
        this.view = view;
    }

    // Handles the login operation
    public void login(String inputUsername, String inputPassword) {
        if (user.isValid(inputUsername, inputPassword)) {
            view.displaySuccessMessage();
        } else {
            view.displayFailureMessage();
        }
    }
}
