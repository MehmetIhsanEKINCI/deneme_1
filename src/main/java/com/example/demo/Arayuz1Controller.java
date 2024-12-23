package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Arayuz1Controller {

    @FXML
    private AnchorPane anchorpaneKitapBilgileri;

    @FXML
    private Button buttonAnaSayfa;

    @FXML
    private Button buttonGeri;

    @FXML
    private Button buttonKitapEkle;

    @FXML
    private Button buttonKitapGuncelle;

    @FXML
    private Button buttonKitapSil;

    @FXML
    private Button buttonKitaplariListele;

    @FXML
    private Button buttonListele;

    @FXML
    private Label labelKitapBllgileri;

    @FXML
    private TableView<?> tableviewKitap;

    @FXML
    private TextField textfieldKitapArama;

    @FXML
    void onBackButton(ActionEvent event) {

    }

}
