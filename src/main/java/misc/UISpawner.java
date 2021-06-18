package misc;


import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.Duration;
import misc.data.LineDims;
import sample.Bar;

import java.io.IOException;

public class UISpawner {

    private final Transition transition = new Transition();

    public void dynamicLoad(String fxml, Pane pane) {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(fxml + ".fxml"));
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pane.getChildren().add(root);
        assert root != null;
        root.toFront();
    }

    public void dynamicBar(VBox vBox) {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("bar.fxml"));
            root = loader.load();
            Bar bar = loader.getController();

        } catch (IOException e) {
            e.printStackTrace();
        }
        vBox.getChildren().add(root);

        assert root != null;
//        root.toFront();
    }

    public void splashSpawn(Pane mainPane, Pane splashDisplay) {
        PauseTransition pauseTransition1 = new PauseTransition(Duration.millis(1999));
        pauseTransition1.setOnFinished(actionEvent -> {
            splashDisplay.toFront();
            dynamicLoad("splash", splashDisplay);

            PauseTransition pauseTransition = new PauseTransition(Duration.millis(11000));
            pauseTransition.setOnFinished(actionEvent1 -> {
                splashDisplay.toBack();
                mainPane.getChildren().remove(splashDisplay);
            });
            pauseTransition.play();
        });
        pauseTransition1.play();

    }

    public void lineDrawer(Pane pane, LineDims lineDims, int lineNo) {

        Line line = new Line();
        line.setLayoutX(lineDims.getlX());
        line.setLayoutY(lineDims.getlY());

        line.setStartX(lineDims.getsX());
        line.setEndX(lineDims.geteX());

        line.setStartY(lineDims.getsY());
        line.setEndY(lineDims.geteY());

        Color color;

        switch (lineNo){
            case 1:
                color = Color.CYAN;
                break;
            case 2:
                color = Color.LIGHTBLUE;
                break;
            case 3:
                color = Color.BLUE;
                break;
            case 4:
                color = Color.PINK;
                break;
            case 5:
                color = Color.MAGENTA;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lineNo);
        }

        line.setStroke(color);

        line.setStrokeWidth(3);

        pane.getChildren().add(line);
        line.toFront();
        transition.fade(line, 0, 1, 150);

    }

}
