package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.logging.Logger;

public class Main extends Application {
     private static Logger LOGGER = Logger.getLogger(Main.class.getName());

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        LOGGER.info("Root is initialize.");


        primaryStage.setTitle("Boolean calculator");
        LOGGER.info("Set title for primaryStage."+primaryStage.getTitle());
        primaryStage.setScene(new Scene(root, 370, 485));
        LOGGER.info("Set scene for primaryStage.");
        primaryStage.getIcons().add(new Image("sample/7687d5e1576c3408ef007bab3f1dc474.png"));
        LOGGER.info("Set icon for primaryStage.");

        primaryStage.show();
        LOGGER.info("PrimaryStage is activate.");
    }


    public static void main(String[] args) {
        launch(args);//6
        LOGGER.info("Program is over.");
    }
}
