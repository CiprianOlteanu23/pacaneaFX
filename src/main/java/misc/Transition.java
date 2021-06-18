package misc;

import animatefx.animation.AnimationFX;
import animatefx.animation.Bounce;
import animatefx.animation.Pulse;
import com.jfoenix.transitions.JFXFillTransition;
import javafx.animation.*;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;

public class Transition {

    public void fade(Node node, double fromOpacity, double toOpacity, int millis) {
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setFromValue(fromOpacity);
        fadeTransition.setToValue(toOpacity);
        fadeTransition.setNode(node);
        fadeTransition.setDuration(Duration.millis(millis));
        fadeTransition.play();
        node.setDisable(toOpacity == 0);
    }

    public void fade(Node node, double fromOpacity, double toOpacity, int millis, int delay) {
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setFromValue(fromOpacity);
        fadeTransition.setToValue(toOpacity);
        fadeTransition.setNode(node);
        fadeTransition.setDuration(Duration.millis(millis));
        fadeTransition.setDelay(Duration.millis(delay));
        fadeTransition.play();
        node.setDisable(toOpacity == 0);

    }

    public void yAxisSlide(Pane pane, int startValue, int endValue, double duration) {
        pane.translateYProperty().set(startValue);

        pane.toFront();

        Timeline timeline = new Timeline();

        KeyValue keyValue = new KeyValue(pane.translateYProperty(), endValue, Interpolator.EASE_IN);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(duration), keyValue);

        timeline.getKeyFrames().add(keyFrame);

        timeline.play();

    }

    public void yAxisSlide(Pane pane, int startValue, int endValue, double duration, Runnable runnable) {
        pane.translateYProperty().set(startValue);

        pane.toFront();

        Timeline timeline = new Timeline();

        KeyValue keyValue = new KeyValue(pane.translateYProperty(), endValue, Interpolator.EASE_IN);

        timeline.setOnFinished(actionEvent -> {
            Platform.runLater(runnable);
        });

        KeyFrame keyFrame = new KeyFrame(Duration.millis(duration), keyValue);

        timeline.getKeyFrames().add(keyFrame);

        timeline.play();

    }

    public void yAxisSlide(Pane pane, int startValue, int endValue, double duration, double delay) {
        pane.translateYProperty().set(startValue);

        pane.toFront();

        Timeline timeline = new Timeline();

        KeyValue keyValue = new KeyValue(pane.translateYProperty(), endValue, Interpolator.EASE_IN);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(duration), keyValue);

        timeline.getKeyFrames().add(keyFrame);

        timeline.setDelay(Duration.millis(delay));

        timeline.play();
    }

    public void bounce(Node node) {
        Pulse pulse = new Pulse(node);
        //pulse.setSpeed(100);
        pulse.setCycleCount(AnimationFX.INDEFINITE);
        pulse.play();

    }

    public void fillTransitionBlue(int millis, Region region) {
        if (!region.isDisabled()) {
            JFXFillTransition fillTransition1 = new JFXFillTransition(Duration.millis(millis), region);
            fillTransition1.setFromValue(Color.RED);
            fillTransition1.setToValue(Color.BLUE);
            //fillTransition1.setDelay(Duration.millis(millis));
            fillTransition1.setOnFinished(actionEvent1 -> {
                fillTransitionRed(millis, region);
            });
            fillTransition1.play();
        }
    }

    public void fillTransitionRed(int millis, Region region) {
        if (!region.isDisabled()) {

            JFXFillTransition fillTransition1 = new JFXFillTransition(Duration.millis(millis), region);
            fillTransition1.setFromValue(Color.BLUE);
            fillTransition1.setToValue(Color.RED);
            //fillTransition1.setDelay(Duration.millis(millis));
            fillTransition1.setOnFinished(actionEvent1 -> {
                fillTransitionBlue(millis, region);
            });
            fillTransition1.play();
        }
    }

    public void outroFillTransition(int millis, Color colorFrom, Color colorTo, Region region) {

        JFXFillTransition fillTransition1 = new JFXFillTransition(Duration.millis(millis), region);
        fillTransition1.setFromValue(colorFrom);
        fillTransition1.setToValue(colorTo);
        fillTransition1.setDelay(Duration.millis(millis));
        fillTransition1.play();


    }

    public void flash(Text text, String message, int millis, int delay, boolean flash) {
        if (flash) {
            FadeTransition fadeTransition = new FadeTransition();
            fadeTransition.setFromValue(0);
            fadeTransition.setToValue(1);
            fadeTransition.setNode(text);
            text.setText(message);
            fadeTransition.setDuration(Duration.millis(millis));
            fadeTransition.setDelay(Duration.millis(delay));
            fadeTransition.setOnFinished(actionEvent -> {
                flash(text, message, millis, delay, flash);
            });
            fadeTransition.play();
        }

    }

    public void textEpilepsyRB(Text text, int millis, boolean isOk) {

        fade(text, 0, 1, 250);

        Thread colorChange = new Thread(() -> {
            while (!isOk) {
                try {
                    Thread.sleep(millis);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    int r = (int) (Math.random() * 255);
                    int g = (int) (Math.random() * 255);
                    int b = (int) (Math.random() * 255);

                    text.setFill(Color.rgb(r, g, b));
                });

            }


        });
        colorChange.start();

    }

    private void scrollInstantly(ScrollPane scrollPane) {
        Animation animation = new Timeline(
                new KeyFrame(Duration.millis(1),
                        new KeyValue(scrollPane.vvalueProperty(), -1)));
        animation.play();
    }

    public void scrollInstantly(ScrollPane scrollPane, ScrollPane scrollPane1, ScrollPane scrollPane2, ScrollPane scrollPane3, ScrollPane scrollPane4) {
        scrollInstantly(scrollPane);
        scrollInstantly(scrollPane1);
        scrollInstantly(scrollPane2);
        scrollInstantly(scrollPane3);
        scrollInstantly(scrollPane4);

    }


}
