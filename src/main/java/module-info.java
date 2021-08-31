module com.example.parserapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.jsoup;
    requires junit;
    requires org.testng;
    requires java.logging;
    opens com.example.testapp.views to javafx.fxml;
    opens com.example.testapp to javafx.fxml;
    opens com.example.testapp.data to javafx.base;
    opens com.example.testapp.controllers to javafx.fxml;
    exports com.example.testapp.views;
    exports com.example.testapp.tests;
    exports com.example.testapp.data;
    exports com.example.testapp.models;
    exports com.example.testapp;
    exports com.example.testapp.controllers;
}