package com.example.testapp.controllers;

import com.example.testapp.models.Model;
import com.example.testapp.views.TableWordsViewImpl;

public class TableOfWordsController extends TableWordsViewImpl {

    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

}
