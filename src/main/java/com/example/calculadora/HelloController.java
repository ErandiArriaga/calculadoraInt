package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;


public class HelloController {
    @FXML
    private Button btnSimple, btnCompuesto;

   @FXML
    protected void onSimpleButtonClick() {
        showMessage("El interés simple es de:");
    }


   @FXML
    protected void onCompuestoButtonClick() {

        showMessage("El interés compuesto final es de" + ", dando una suma total de");
    }
    private void setBtnCompuesto(){
        double capital, tiempo, tasa, interes, monto;
        capital=Double.parseDouble(btnCompuesto.getText());
        tiempo=Double.parseDouble(btnCompuesto.getText());
        tasa=Double.parseDouble(btnCompuesto.getText());

        monto=Math.pow(1+tasa, tiempo) * 100;
        interes= monto - capital;

        //txtInteresF.setText(Double.toString(interes));//


    }


    private void showMessage (String message){
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setContentText(message);
        alert.show();
    }
}