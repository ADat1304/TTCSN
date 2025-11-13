package com.example.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("mainLayout.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 1200, 750);
            scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
            stage.setTitle("Quản lý quán cafe");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
