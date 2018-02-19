package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


        primaryStage.setTitle("Boolean calculator");
        primaryStage.setScene(new Scene(root, 370, 485));
        primaryStage.getIcons().add(new Image("sample/7687d5e1576c3408ef007bab3f1dc474.png"));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
