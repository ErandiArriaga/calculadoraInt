package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;


public class HelloController {
    @FXML
    private Button btnSimple;

    @FXML
    protected void onSimpleButtonClick() {
        showMessage("El interés simple es de:");
    }

    @FXML
    protected void onCompuestoButtonClick() {

        showMessage("El interés compuesto es de:");
    }

    @FXML
    protected void onINTCButtonClick() {

        showMessage("El interés compuesto al final del año(s) es de:");
    }

    private void showMessage (String message){
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setContentText(message);
        alert.show();
    }
}