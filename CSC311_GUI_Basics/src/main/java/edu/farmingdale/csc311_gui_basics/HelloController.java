package edu.farmingdale.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button btn1;
    int x = 10;
    @FXML
    void rotateMe(ActionEvent event){
        btn1.setRotate(x++);
        }
        @FXML
        protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        }

    }
