package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.logging.Logger;

import static java.awt.Color.green;

public class Controller {
    private static Logger LOGGER = Logger.getLogger(Controller.class.getName());
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
        LOGGER.info("First operant is set items.");
        secondOperant.setItems(booleanu);
        LOGGER.info("Second operant is set items.");
        LOGGER.info("Operants is set items.");
    }

    @FXML
    void Conjuncture(ActionEvent event) {
        txtRezult.setText(bol.conjucture(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Conjuncture is worked correctly.");
    }

    @FXML
    void Disjunction(ActionEvent event) {
        txtRezult.setText(bol.disjunction(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Disjunction is worked correctly.");
    }

    @FXML
    void Xor(ActionEvent event) {
        txtRezult.setText(bol.xor(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("XOR is worked correctly.");
    }

    @FXML
    void Implication(ActionEvent event) {
        txtRezult.setText(bol.implication(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Implication is worked correctly.");
    }

    @FXML
    void Xnor(ActionEvent event) {
        txtRezult.setText(bol.xnor(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("XNOR is worked correctly.");
    }

    @FXML
    void Nand(ActionEvent event) {
        txtRezult.setText(bol.nand(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("NAND is worked correctly.");
    }

    @FXML
    void ReverseImplication(ActionEvent event) {
        txtRezult.setText(bol.reverseImplication(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Reverse impication is worked correctly.");
    }

    @FXML
    void Nor(ActionEvent event) {
        txtRezult.setText(bol.nor(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("NOR is worked correctly.");
    }

    @FXML
    void InditicalZero(ActionEvent event) {
        txtRezult.setText(bol.inditicalZero(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Inditical zero is worked correctly.");
    }

    @FXML
    void InverseImplication(ActionEvent event) {
        txtRezult.setText(bol.inverseImplication(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Inverse implication is worked correctly.");
    }

    @FXML
    void InverseFirstOperand(ActionEvent event) {
        txtRezult.setText(bol.inverseFirstOperand(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Inverse first operand is worked correctly.");
    }

    @FXML
    void NegationSecondOperand(ActionEvent event) {
        txtRezult.setText(bol.negationSecondOperand(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Nagation second operand is worked correctly.");
    }

    @FXML
    void NegationFirstOperand(ActionEvent event) {
        txtRezult.setText(bol.negationFirstOperand(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Nagation first operand is worked correctly.");
    }

    @FXML
    void FirstOperand(ActionEvent event) {
        txtRezult.setText(bol.first(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("First operand is worked correctly.");
    }

    @FXML
    void SecondOperand(ActionEvent event) {
        txtRezult.setText(bol.second(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Second operand is worked correctly.");
    }

    @FXML
    void Tautology(ActionEvent event) {
        txtRezult.setText(bol.tautology(firstOperant.getValue(),secondOperant.getValue()));
        LOGGER.info("Tautology is worked correctly.");
    }//19
}



