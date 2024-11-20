package cs112.lab09.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.awt.*;

public class EventController {

    @FXML
    private Button closeButton;
    @FXML
    private Label locationLabel, dateLabel, descriptionLabel, revisedDescriptionLabel;















    @FXML
    protected void closeButtonClick(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}
