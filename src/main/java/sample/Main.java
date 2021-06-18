package sample;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final String FXML_PATH = "sample.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(FXML_PATH));
        Parent root = loader.load();
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(true);
        primaryStage.setForceIntegerRenderScale(true);
        primaryStage.setScene(new Scene(root, 1500, 1000));
        primaryStage.setTitle("Pacanea");

        PauseTransition pauseTransition = new PauseTransition(Duration.millis(1999));
        pauseTransition.setOnFinished(actionEvent -> {
            primaryStage.show();
        });
        pauseTransition.play();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
