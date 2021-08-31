package com.example.testapp.views;

import com.example.testapp.data.Word;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import java.util.List;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class TableWordsViewImpl implements TableWordsView {


    private final ObservableList<Word> wordsData = FXCollections.observableArrayList();

    @FXML private TableView<Word> tableWords;

    @FXML private TableColumn<Word, String> valueColumn;

    @FXML private TableColumn<Word, Integer> countColumn;

    @Override
    public void setTableOfWords(List<Word> listWords) {
        wordsData.setAll(listWords);
        valueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));
        countColumn.setCellValueFactory(new PropertyValueFactory<>("count"));
        tableWords.setItems(wordsData);
    }
}
