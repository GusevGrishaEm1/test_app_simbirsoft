package com.example.testapp.views;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class InputURLViewImpl implements InputURLView {

    @FXML private TextArea urlTextArea;

    @Override
    public String getURL() {
        return urlTextArea.getText();
    }

}

