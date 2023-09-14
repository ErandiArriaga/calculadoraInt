package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class HelloController {


    @FXML
    private Button btnSimple;

    // Primeros botones
    @FXML
    TextField txtSumaPrincipal, txtTasaInteres, txtPeriodoTiempo;

    @FXML
    TextField txtCantidadPrincipal,txtTasaInteres2,txtPeriodoTiempo2;

    @FXML
    TextField txtCantidadPrincipal2, txtCantidadCompuesta;

    @FXML
    protected void onSimpleButtonClick() {
        try{
            float suma_principal = Float.parseFloat(txtSumaPrincipal.getText());
            float tasa_de_interes = Float.parseFloat(txtTasaInteres.getText());
            float periodo_tiempo = Float.parseFloat(txtPeriodoTiempo.getText());
            float res = (suma_principal * tasa_de_interes * periodo_tiempo) / 100;
            showMessage("El interés simple es de :"+res);
        }catch (Exception err){
            showMessage("Verifica los datos");
        }

    }

    @FXML
    protected void onCompuestoButtonClick() {
        try{
            float cantidad_principal = Float.parseFloat(txtCantidadPrincipal.getText());
            float tasa_de_interes = Float.parseFloat(txtTasaInteres2.getText());
            float periodo_tiempo = Float.parseFloat(txtPeriodoTiempo2.getText());
            float res = (float) (cantidad_principal * (Math.pow(( 1 + tasa_de_interes / 100), periodo_tiempo)));
            showMessage("El interés compuesto es de:: "+res);
        }catch (Exception err){
            showMessage("Verifica los datos");
        }
    }

    @FXML
    protected void onINTCButtonClick() {
        try{
            float cantidad_compuesta = Float.parseFloat(txtCantidadCompuesta.getText());
            float cantidad_principal = Float.parseFloat(txtCantidadPrincipal2.getText());
            float res = cantidad_compuesta - cantidad_principal;
            showMessage("El interés compuesto al final del año(s) es de: "+res);
        }catch (Exception err){
            showMessage("Verifica los datos");
        }

    }

    private void showMessage (String message) {
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setContentText(message);
        alert.show();
    }
}