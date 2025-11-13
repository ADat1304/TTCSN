package com.example.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {



    @Override
    public void start(Stage stage) throws Exception {

            FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("login_view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1267, 739);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }
}
