package com.example.testapp.models;

import com.example.testapp.data.WebPage;
import com.example.testapp.data.Word;

import java.io.IOException;
import java.util.List;

public class ModelImpl implements Model {

    private WebPage webPage;

    public ModelImpl() {
        webPage = new WebPage();
    }

    @Override
    public List<Word> getListOfWordsOnTheWebPage(String url) throws IOException {
        webPage.setUrl(url);
        webPage.setListOfWords();
        return webPage.getListOfWords();
    }



}
