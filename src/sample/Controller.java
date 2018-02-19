package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

import static java.awt.Color.green;

public class Controller {
    private BooleanFunctions bol = new BooleanFunctions();
    @FXML
    private ComboBox<String> secondOperant;

    @FXML
    private ComboBox<String> firstOperant;

    @FXML
    private Button conjuncture;

    @FXML
    private TextField txtRezult;

    @FXML
    private Button disjunction;

    @FXML
    private Button xnor;


    @FXML
    private Button inverseImplication;

    @FXML
    private Button firstOperand;

    @FXML
    private Button iditicalZero;

    @FXML
    private Button reverseImplication;

    @FXML
    private Button nor;

    @FXML
    private Button SecondOperand;

    @FXML
    private Button inverseFirstOperand;

    @FXML
    private Button negationFirstOperand;

    @FXML
    private Button implication;

    @FXML
    private Button tautology;

    @FXML
    private Button xor;

    @FXML
    private Button nand;

    @FXML
    private Button negationSecondOperand;

    //ArrayList<BooleanFunctions> person = new ArrayList<>();

    ObservableList<String> booleanu
            = FXCollections.observableArrayList("True", "False", "Null");

    @FXML
    private void initialize() {
        firstOperant.setItems(booleanu);
        secondOperant.setItems(booleanu);
    }

    @FXML
    void Conjuncture(ActionEvent event) {

        txtRezult.setText(bol.conjucture(firstOperant.getValue(),secondOperant.getValue()));

    }

    @FXML
    void Disjunction(ActionEvent event) {
        txtRezult.setText(bol.disjunction(firstOperant.getValue(),secondOperant.getValue()));

    }

    @FXML
    void Xor(ActionEvent event) {
        txtRezult.setText(bol.xor(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void Implication(ActionEvent event) {
        txtRezult.setText(bol.implication(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void Xnor(ActionEvent event) {
        txtRezult.setText(bol.xnor(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void Nand(ActionEvent event) {
        txtRezult.setText(bol.nand(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void ReverseImplication(ActionEvent event) {
        txtRezult.setText(bol.reverseImplication(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void Nor(ActionEvent event) {
        txtRezult.setText(bol.nor(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void InditicalZero(ActionEvent event) {
        txtRezult.setText(bol.inditicalZero(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void InverseImplication(ActionEvent event) {
        txtRezult.setText(bol.inverseImplication(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void InverseFirstOperand(ActionEvent event) {
        txtRezult.setText(bol.inverseFirstOperand(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void NegationSecondOperand(ActionEvent event) {
        txtRezult.setText(bol.negationSecondOperand(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void NegationFirstOperand(ActionEvent event) {
        txtRezult.setText(bol.negationFirstOperand(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void FirstOperand(ActionEvent event) {
        txtRezult.setText(bol.first(firstOperant.getValue(),secondOperant.getValue()));


    }

    @FXML
    void SecondOperand(ActionEvent event) {
        txtRezult.setText(bol.second(firstOperant.getValue(),secondOperant.getValue()));

    }

    @FXML
    void Tautology(ActionEvent event) {
        txtRezult.setText(bol.tautology(firstOperant.getValue(),secondOperant.getValue()));

    }
}



