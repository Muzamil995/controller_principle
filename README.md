# Controller Principle in Java

This repository demonstrates the **Controller** principle in Java using a simple MVC (Model-View-Controller) architecture. The Controller principle suggests that an entity responsible for handling system operations should be encapsulated in a separate class to promote better separation of concerns.

## Project Structure

The project implements a basic login system where:

- **Model** handles the business logic (User class)
- **View** manages the user interface (LoginView class)
- **Controller** coordinates the interaction between the Model and View (LoginController class)

### Files

1. **Model/User.java**
   - This class represents the model, responsible for handling the user data and business logic.
   
2. **View/LoginView.java**
   - The view class manages the user interface, prompting users for login input and displaying success/failure messages.
   
3. **Controller/LoginController.java**
   - This class acts as the controller that manages the interaction between the model (User) and the view (LoginView).
   
4. **MVCDemo.java**
   - The main demo class that integrates the model, view, and controller to simulate a login operation.

## Usage

To run this project:

1. Clone the repository:
   ```bash
   git clone https://github.com/Muzamil995/controller_principle.git
