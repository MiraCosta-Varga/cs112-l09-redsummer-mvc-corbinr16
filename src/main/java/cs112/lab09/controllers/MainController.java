package cs112.lab09.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    private Button startButton, quitButton;

    //METHODS

    public void startButtonClick(ActionEvent actionEvent) throws IOException {

        Parent mapView = FXMLLoader.load(getClass().getResource("MapScene.fxml"));
        Scene mapViewScene = new Scene(mapView);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mapViewScene);
        window.show();


        //System.out.println("Start button pressed.");

    }

    @FXML
    public void quitButtonClick() {

        System.out.println("Thank you for being interested in the truth of our history. Goodbye!");
        System.exit(0);
    }
}