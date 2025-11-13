package com.example.test.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login_Controller {
    @FXML
    private TextField name_userTF;
    @FXML
    private PasswordField password;

    @FXML
    private Button login;

    @FXML
    public void submit(ActionEvent event){
        String nameUser = name_userTF.getText();
        String pass = password.getText();
        System.out.println("user name: "+ nameUser);
        System.out.println("password: "+ pass);
    }


}
