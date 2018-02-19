package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Created by Денис on 16.11.2017.
 */
public class BooleanFunctions {
    private String firstOperand;
    private String secondOperand;
    private String rezult;


    public void setFirstOperand(String firstOperants) {
        this.firstOperand = firstOperants;
    }

    public void setSecondOperand(String secondOperants) {
        this.secondOperand = secondOperants;
    }

    public String getFirstOperand() {

        return firstOperand;
    }

    public String getSecondOperand() {
        return secondOperand;
    }

    public BooleanFunctions() {
        firstOperand = "";
        secondOperand = "";
        rezult = "";
    }

    public void setRezult(String rezult) {

        this.rezult = rezult;
    }

    public String getRezult() {

        return rezult;
    }

    public BooleanFunctions(String value, String value1, String value2) {
        this.firstOperand = value;
        this.secondOperand = value1;
        this.rezult = value2;

    }

    public String conjucture(String first, String second) {
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "Null";
        if (firstOperand.equals("False") || secondOperand.equals("False")) {
            rezult = "False";
            return rezult;
        } else if (firstOperand.equals("True") && secondOperand.equals("True")) {
            rezult = "True";
            return rezult;
        }
        return rezult;
    }

    public String disjunction(String first, String second) {
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "True";
        if (firstOperand.equals("True") && secondOperand.equals("True")) {
            rezult = "True";
            return rezult;
        } else if (firstOperand.equals("Null") || secondOperand.equals("Null")) {
            rezult = "Null";
            return rezult;
        }
        return rezult;
    }

    public String xor(String first, String second) {
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "True";
        if (firstOperand.equals(secondOperand)) {
            rezult = "False";
            return rezult;
        }
        return rezult;
    }

    public String implication(String first, String second) {
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "True";
        if (firstOperand.equals(secondOperand)) {
            return rezult;
        } else if (firstOperand.equals("True") && secondOperand.equals("False")) {
            rezult = "False";
            return rezult;
        } else if ((firstOperand.equals("True") && secondOperand.equals("Null")) ||
                (firstOperand.equals("Null") && secondOperand.equals("True"))) {
            rezult = "Null";
            return rezult;
        } else if ((firstOperand.equals("False") && secondOperand.equals("Null")) ||
                (firstOperand.equals("Null") && secondOperand.equals("False"))) {
            rezult = "Null";
            return rezult;
        }
        return rezult;
    }

    public String xnor(String first, String second) {
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "False";
        if (firstOperand.equals(secondOperand)) {
            return "True";
        }
        return rezult;
    }

    public String nand(String first, String second) {
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "True";

        if (firstOperand.equals("False") || secondOperand.equals("False")) {
            rezult = "True";
            return rezult;
        } else if (firstOperand.equals("True") && secondOperand.equals("True")) {
            rezult = "False";
            return rezult;
        } else if ((firstOperand.equals("True") || secondOperand.equals("True")) &&
                (firstOperand.equals("Null") || secondOperand.equals("Null"))) {
            rezult = "Null";
            return rezult;
        }
        return rezult;
    }
    public String reverseImplication(String first, String second){
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "True";
        if (firstOperand.equals(secondOperand))  {
            rezult = "True";
           return rezult;
        } else if (firstOperand.equals("False") && secondOperand.equals("True")){
            rezult = "False";
           return rezult;
        }
        return rezult;
    }
    public String nor(String first, String second) {
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "True";
        if ((firstOperand.equals("True") || secondOperand.equals("True")) ||
                (firstOperand.equals("True") && secondOperand.equals("True"))) {
            rezult = "False";
            return rezult;
        } else if (firstOperand.equals("Null") && secondOperand.equals("Null")) {
            rezult = "Null";
            return rezult;
        }
        return rezult;
    }
    public String inditicalZero(String first, String second){
        this.firstOperand = first;
        this.secondOperand = second;
        return "False";
    }
    public String inverseImplication(String first, String second){
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "False";
        if((firstOperand.equals("True")&&secondOperand.equals("False"))||
                (firstOperand.equals("True")&&secondOperand.equals("Null"))){
            rezult = "True";
           return rezult;
        }
        return rezult;
    }
    public String inverseFirstOperand(String first, String second){
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "False";
        if((secondOperand.equals("True")&&firstOperand.equals("False"))||
                (firstOperand.equals("Null")&&secondOperand.equals("True"))){
            rezult ="True";
           return rezult;
        }
        return rezult;
    }
    public String negationSecondOperand(String first, String second){
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "Null";
        if(secondOperand.equals("True")) {
            rezult ="False";
            return rezult;
        }
        else if(secondOperand.equals("False")){
           rezult = "True";
           return rezult;
        }
        return rezult;

    }
     public String negationFirstOperand(String first, String second){
         this.firstOperand = first;
         this.secondOperand = second;
         String rezult = "Null";
         if(firstOperand.equals("True")) {
             rezult ="Null";
             return rezult;
         }
         else if(firstOperand.equals("False")){
            rezult = "True";
            return rezult;
         }
         return rezult;
     }
     public String first(String first, String second){
         this.firstOperand = first;
         this.secondOperand = second;
         String rezult = firstOperand;
         return rezult;
     }
    public String second(String first, String second){
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = secondOperand;
        return rezult;
    }
    public String tautology(String first, String second){
        this.firstOperand = first;
        this.secondOperand = second;
        String rezult = "True";
        return rezult;
    }

}





