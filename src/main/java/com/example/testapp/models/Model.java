package com.example.testapp.models;
import com.example.testapp.data.Word;

import java.io.IOException;
import java.util.List;

public interface Model {
    List<Word> getListOfWordsOnTheWebPage(String url) throws IOException;
}
