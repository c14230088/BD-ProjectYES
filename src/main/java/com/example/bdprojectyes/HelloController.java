package com.example.bdprojectyes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        JavaPostgreSQL.insertIntoKelasTable("Galilea",true);
    }
}