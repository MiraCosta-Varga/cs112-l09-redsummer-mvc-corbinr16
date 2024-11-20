package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class MapController {

    @FXML
    private Button infoButton1, infoButton2;

    @FXML
    protected void infoButtonOneClick() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("InformationScene.fxml"));
        Parent eventViewParent = loader.load();

        EventController eventController = loader.getController();
        eventController.initData("San Francisco, CA", new RevisedHistoricalEvent("This is a description of the event", new Date(5,15,1919), "This is a revised description.", "this is a citation"));


        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL); //locks screen to current popup window

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();

    }

    @FXML
    protected void infoButtonTwoClick() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("InformationScene.fxml"));
        Parent eventViewParent = loader.load();

        EventController eventController = loader.getController();
        eventController.initData("San Francisco, CA", new RevisedHistoricalEvent("This is a description of the event", new Date(7,13,1919), "This is a revised description.", "this is a citation"));

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL); //locks screen to current popup window

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();

    }
}
