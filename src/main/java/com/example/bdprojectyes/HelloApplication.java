package com.example.bdprojectyes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml")); // GETCLASS() ??

        AnchorPane root = fxmlLoader.load(); // AnchorPane or Group or Parent as rootNode
//  sudah ada di CSS    root.setBackground(new Background(new BackgroundFill(Color.LIGHTSKYBLUE,null, null))); //color, cornerRadii, inset

        Scene scene = new Scene(root, 800, 480);
        stage.setTitle("Project BD - Sekolah Minggu!");

//      CSS
        String css = this.getClass().getResource("/style.css").toExternalForm(); // GETCLASS() ??
        scene.getStylesheets().add(css);

//      ICON
        Image icon = new Image("icon.jpg");
        stage.getIcons().add(icon);

//      SET STAGE
        stage.setScene(scene);
//      stage.setFullScreen(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}