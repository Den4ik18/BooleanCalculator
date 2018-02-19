package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.logging.Logger;

/**
 * Created by Денис on 16.11.2017.
 */
public class BooleanFunctions {
    private String firstOperand;
    private String secondOperand;
    private String rezult;

    private static Logger LOGGER = Logger.getLogger(BooleanFunctions.class.getName());
    public void setFirstOperand(String firstOperants) {
        this.firstOperand = firstOperants;
        LOGGER.info("SetFirstOperand worked correctly.");
    }

    public void setSecondOperand(String secondOperants) {
        this.secondOperand = secondOperants;
        LOGGER.info("SetSecondOperand worked correctly.");
    }

    public String getFirstOperand() {
        LOGGER.info("GetFirstOperand worked correctly.");
        return firstOperand;
    }

    public String getSecondOperand() {
        LOGGER.info("GetSecondOperand worked correctly.");
        return secondOperand;
    }

    public BooleanFunctions() {
        firstOperand = "";
        LOGGER.info("First operand is init by default.");
        secondOperand = "";
        LOGGER.info("Second operand is init by default.");
        rezult = "";
        LOGGER.info("Rezult is init by default.");
        LOGGER.info("Constructor without parameters is worked correctly.");
    }

    public void setRezult(String rezult) {
        this.rezult = rezult;
        LOGGER.info("SetRezult worked correctly.");
    }

    public String getRezult() {
        LOGGER.info("GetRezult worked correctly.");
        return rezult;
    }

    public BooleanFunctions(String value, String value1, String value2) {
        this.firstOperand = value;
        LOGGER.info("First opearand is init.");
        this.secondOperand = value1;
        LOGGER.info("Second opearand is init.");
        this.rezult = value2;
        LOGGER.info("Rezult is init.");
        LOGGER.info("Constructor worked correctly.");

    }
     //10
    public String conjucture(String first, String second) {
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "Null";
        if (firstOperand.equals("False") || secondOperand.equals("False")) {
            rezult = "False";
            LOGGER.info("Rezult is init: False");
            return rezult;
        } else if (firstOperand.equals("True") && secondOperand.equals("True")) {
            LOGGER.info("Rezult is init: True");
            rezult = "True";
            return rezult;
        }
        LOGGER.info("Ruzult is init: Null");
        return rezult;
    }

    public String disjunction(String first, String second) {
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "True";
        if (firstOperand.equals("True") && secondOperand.equals("True")) {
            rezult = "True";
            LOGGER.info("Rezult is init: True");
            return rezult;
        } else if (firstOperand.equals("Null") || secondOperand.equals("Null")) {
            rezult = "Null";
            LOGGER.info("Rezult is init: Null");
            return rezult;
        }
        LOGGER.info("Rezult is init: True");
        return rezult;
    }

    public String xor(String first, String second) {
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "True";
        if (firstOperand.equals(secondOperand)) {
            rezult = "False";
            LOGGER.info("Rezult is init: False");
            return rezult;
        }
        LOGGER.info("Rezult is init: True");
        return rezult;
    }

    public String implication(String first, String second) {
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "True";
        if (firstOperand.equals(secondOperand)) {
            LOGGER.info("Rezult is init: True");
            return rezult;
        } else if (firstOperand.equals("True") && secondOperand.equals("False")) {
            rezult = "False";
            LOGGER.info("Rezult is init: False");
            return rezult;
        } else if ((firstOperand.equals("True") && secondOperand.equals("Null")) ||
                (firstOperand.equals("Null") && secondOperand.equals("True"))) {
            rezult = "Null";
            LOGGER.info("Rezult is init: Null");
            return rezult;
        } else if ((firstOperand.equals("False") && secondOperand.equals("Null")) ||
                (firstOperand.equals("Null") && secondOperand.equals("False"))) {
            rezult = "Null";
            LOGGER.info("Rezult is init: Null");
            return rezult;
        }
        LOGGER.info("Rezult is init: True");
        return rezult;
    }
     //31
    public String xnor(String first, String second) {
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "False";
        if (firstOperand.equals(secondOperand)) {
            LOGGER.info("Rezult is init: True");
            return "True";
        }
        LOGGER.info("Rezult is init: False");
        return rezult;
    }

    public String nand(String first, String second) {
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "True";

        if (firstOperand.equals("False") || secondOperand.equals("False")) {
            rezult = "True";
            LOGGER.info("Rezult is init: True");
            return rezult;
        } else if (firstOperand.equals("True") && secondOperand.equals("True")) {
            rezult = "False";
            LOGGER.info("Rezult is init: False");
            return rezult;
        } else if ((firstOperand.equals("True") || secondOperand.equals("True")) &&
                (firstOperand.equals("Null") || secondOperand.equals("Null"))) {
            rezult = "Null";
            LOGGER.info("Rezult is init: Null");
            return rezult;
        }
        LOGGER.info("Rezult is init: True");
        return rezult;
    }
    public String reverseImplication(String first, String second){
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "True";
        if (firstOperand.equals(secondOperand))  {
            rezult = "True";
            LOGGER.info("Rezult is init: True");
           return rezult;
        } else if (firstOperand.equals("False") && secondOperand.equals("True")){
            rezult = "False";
            LOGGER.info("Rezult is init: False");
           return rezult;
        }
        LOGGER.info("Rezult is init: True");
        return rezult;
    }
    //46
    public String nor(String first, String second) {
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "True";
        if ((firstOperand.equals("True") || secondOperand.equals("True")) ||
                (firstOperand.equals("True") && secondOperand.equals("True"))) {
            rezult = "False";
            LOGGER.info("Rezult is init: False");
            return rezult;
        } else if (firstOperand.equals("Null") && secondOperand.equals("Null")) {
            rezult = "Null";
            LOGGER.info("Rezult is init: Null");
            return rezult;
        }
        LOGGER.info("Rezult is init: True");
        return rezult;
    }
    public String inditicalZero(String first, String second){
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        LOGGER.info("Rezult is init: False");
        return "False";
    }
    public String inverseImplication(String first, String second){
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "False";
        if((firstOperand.equals("True")&&secondOperand.equals("False"))||
                (firstOperand.equals("True")&&secondOperand.equals("Null"))){
            rezult = "True";
            LOGGER.info("Rezult is init: True");
           return rezult;
        }
        LOGGER.info("Rezult is init: False");
        return rezult;
    }
    //58
    public String inverseFirstOperand(String first, String second){
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "False";
        if((secondOperand.equals("True")&&firstOperand.equals("False"))||
                (firstOperand.equals("Null")&&secondOperand.equals("True"))){
            rezult ="True";
            LOGGER.info("Rezult is init: True");
           return rezult;
        }
        LOGGER.info("Rezult is init: False");
        return rezult;
    }
    public String negationSecondOperand(String first, String second){
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "Null";
        if(secondOperand.equals("True")) {
            rezult ="False";
            LOGGER.info("Rezult is init: False");
            return rezult;
        }
        else if(secondOperand.equals("False")){
           rezult = "True";
            LOGGER.info("Rezult is init: True");
           return rezult;
        }
        LOGGER.info("Rezult is init: Null");
        return rezult;

    }
     public String negationFirstOperand(String first, String second){
         this.firstOperand = first;
         LOGGER.info("First opearand is init: "+ getFirstOperand());
         this.secondOperand = second;
         LOGGER.info("Second opearand is init: "+ getSecondOperand());
         String rezult = "Null";
         if(firstOperand.equals("True")) {
             rezult ="Null";
             LOGGER.info("Rezult is init: Null");
             return rezult;
         }
         else if(firstOperand.equals("False")){
            rezult = "True";
             LOGGER.info("Rezult is init: True");
            return rezult;
         }
         LOGGER.info("Rezult is init: Null");
         return rezult;
     }
     //72
     public String first(String first, String second){
         this.firstOperand = first;
         LOGGER.info("First opearand is init: "+ getFirstOperand());
         this.secondOperand = second;
         LOGGER.info("Second opearand is init: "+ getSecondOperand());
         String rezult = firstOperand;
         LOGGER.info("Rezult is init: "+getFirstOperand());
         return rezult;
     }
    public String second(String first, String second){
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = secondOperand;
        LOGGER.info("Rezult is init: "+getSecondOperand());
        return rezult;
    }
    public String tautology(String first, String second){
        this.firstOperand = first;
        LOGGER.info("First opearand is init: "+ getFirstOperand());
        this.secondOperand = second;
        LOGGER.info("Second opearand is init: "+ getSecondOperand());
        String rezult = "True";
        LOGGER.info("Rezult is init: True");
        return rezult;
    }
    //85

}





