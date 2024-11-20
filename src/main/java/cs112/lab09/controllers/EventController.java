package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.awt.*;

public class EventController {

    private RevisedHistoricalEvent redSummerEvent;
    private String location;

    protected void initData(String location, RevisedHistoricalEvent historicalEvent) {

        this.location = location;
        this.redSummerEvent = historicalEvent;

        locationLabel.setText(this.location);
        dateLabel.setText(this.redSummerEvent.getEventDay().toString());
        descriptionLabel.setText(this.redSummerEvent.getDescription());
        revisedDescriptionLabel.setText(this.redSummerEvent.getRevisedDescription());

    }

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
