package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class MainController {

    @FXML
    private Button startButton, quitButton;
    @FXML
    private ImageView logoImageView;

    //METHODS

    @FXML
    public void initialize() {
        logoImageView.setImage(new Image(getClass().getResourceAsStream("/images/Red-Summer.jpg")));
    } //Different way to import image into the image of scenebuilder

    @FXML
    protected void startButtonClick(ActionEvent actionEvent) throws IOException {

        Parent mapView = FXMLLoader.load(MainApplication.class.getResource("MapScene.fxml"));
        Scene mapViewScene = new Scene(mapView);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mapViewScene);
        window.show();

    }

    @FXML
    protected void quitButtonClick() {
        Platform.exit(); //how to close GUIs properly
    }
}