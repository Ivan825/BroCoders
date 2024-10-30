package com.example.frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //temporary filler code
        try {
            // Create a simple VBox layout
            VBox vbox = new VBox(10); // VBox with spacing of 10 units

            // Create TextField for username input
            TextField usernameField = new TextField();
            usernameField.setPromptText("Username");

            // Create PasswordField for password input
            PasswordField passwordField = new PasswordField();
            passwordField.setPromptText("Password");

            // Create a Login button
            Button loginButton = new Button("Login");
            loginButton.setOnAction(event -> {
                String username = usernameField.getText();
                String password = passwordField.getText();

                // Simple validation check
                if (username.equals("user") && password.equals("password")) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed. Please try again.");
                }
            });

            // Add the fields and button to the layout
            vbox.getChildren().addAll(usernameField, passwordField, loginButton);

            // Create a scene with the VBox layout
            Scene scene = new Scene(vbox, 300, 200);

            // Set the stage (window) title
            stage.setTitle("Fantasy Trading Game - Login");

            // Set the scene on the stage
            stage.setScene(scene);

            // Show the stage
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}