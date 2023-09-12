package edu.virginia.cs.coursereviewsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ReviewSystemController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}