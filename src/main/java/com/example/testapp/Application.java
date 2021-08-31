package com.example.testapp;

import com.example.testapp.controllers.InputSiteURLController;
import com.example.testapp.logger.LogFile;
import com.example.testapp.models.ModelImpl;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.logging.Level;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("inputSiteURLForm.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            InputSiteURLController inputSiteURLController = fxmlLoader.getController();
            inputSiteURLController.setModel(new ModelImpl());
            stage.setTitle("Ввод адреса веб-страницы");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            LogFile.LOGGER.log(Level.WARNING,"Произошла ошибка: ", e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}