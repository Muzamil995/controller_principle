package Model;

public class User {
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
