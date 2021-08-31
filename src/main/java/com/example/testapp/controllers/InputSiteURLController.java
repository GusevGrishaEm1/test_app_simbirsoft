package com.example.testapp.controllers;

import com.example.testapp.Application;
import com.example.testapp.logger.LogFile;
import com.example.testapp.models.Model;
import com.example.testapp.models.ModelImpl;
import com.example.testapp.views.InputURLViewImpl;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;

public class InputSiteURLController extends InputURLViewImpl {

    private  Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    @FXML
    protected void onGOButtonClick() {
        try {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("tableOfWordsForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        TableOfWordsController tableOfWordsController = fxmlLoader.getController();
        tableOfWordsController.setModel(new ModelImpl());
        tableOfWordsController.setTableOfWords(model.getListOfWordsOnTheWebPage(getURL()));
        stage.setTitle("Список слов");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        }
        catch (IOException e) {
            LogFile.LOGGER.log(Level.WARNING,"Произошла ошибка: ", e);
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText("Произошла ошибка. Подробная информация находится в лог-файле.");
            alert.showAndWait();
        }
    }





}
