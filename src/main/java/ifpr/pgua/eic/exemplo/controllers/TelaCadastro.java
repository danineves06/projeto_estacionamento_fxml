package ifpr.pgua.eic.exemplo.controllers;

import ifpr.pgua.eic.exemplo.App;
import ifpr.pgua.eic.exemplo.models.Estacionamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaCadastro {

    @FXML
    private TextField tfano;

    @FXML
    private TextField tfcor;

    @FXML
    private TextField tffabricante;

    @FXML
    private TextField tfmodelo;

    @FXML
    private TextField tfplaca;

    private Estacionamento estacionamento;

    public TelaCadastro(Estacionamento estacionamento){
        this.estacionamento = estacionamento; 
    }
    @FXML
    void cadastrar(ActionEvent event) {
        String placa = tfplaca.getText();
        String modelo = tfmodelo.getText();
        String cor = tfcor.getText();
        String fabricante = tffabricante.getText();
        String sAno = tfano.getText();
        int ano = Integer.valueOf(sAno);
        estacionamento.cadastraVeiculo(placa, modelo, fabricante, ano, cor);
    }

    @FXML
    void voltar(ActionEvent event) {
        App.popScreen();
    }

}


