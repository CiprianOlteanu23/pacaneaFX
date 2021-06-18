package sample;

import com.jfoenix.controls.JFXButton;
import javafx.animation.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.MotionBlur;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.Duration;
import misc.*;
import misc.Transition;
import misc.data.CashManager;
import misc.data.DimLists;
import misc.data.LineDims;

import javax.sound.sampled.LineUnavailableException;
import java.util.ArrayList;


public class Controller {


    private final UISpawner uiSpawner = new UISpawner();
    private final Transition transition = new Transition();
    private final BarHandles barHandles = new BarHandles();
    private final AudioPlayer audioPlayer = new AudioPlayer();
    private final Checkers checkers = new Checkers();
    private final DebugSet debugSet = new DebugSet();
    private final DimLists dimLists = new DimLists();
    private final ToolbarHandle toolbarHandle = new ToolbarHandle();
    private final CashManager cashManager = new CashManager();
    private final SpecialEffects specialEffects = new SpecialEffects();

    @FXML
    private Pane mainPane;
    @FXML
    private Pane menuPane;
    @FXML
    private Pane linePane;
    @FXML
    private Pane doublePane;
    @FXML
    private Pane splashDisplay;
    @FXML
    private Pane epilepsyPane;
    @FXML
    private Text promptText;
    @FXML
    private Text titleText;
    @FXML
    private Text creditText;
    @FXML
    private Text winText;
    @FXML
    private Text messageText;
    @FXML
    private Text betText;
    @FXML
    private JFXButton playButton;
    private boolean isStopped;

    @FXML
    private VBox slot1;
    @FXML
    private VBox slot2;
    @FXML
    private VBox slot3;
    @FXML
    private VBox slot4;
    @FXML
    private VBox slot5;

    @FXML
    private ScrollPane barScroll1;
    @FXML
    private ScrollPane barScroll2;
    @FXML
    private ScrollPane barScroll3;
    @FXML
    private ScrollPane barScroll4;
    @FXML
    private ScrollPane barScroll5;

    @FXML
    private JFXButton bagaButton;
    private boolean isRolling = false;
    private boolean isFalit;
    @FXML
    private JFXButton doubleButton;


    public Controller() throws LineUnavailableException {
    }


    @FXML
    private void initialize() { //
        // uiSpawner.splashSpawn(mainPane, splashDisplay);
        barHandles.initialAssign(slot1, slot2, slot3, slot4, slot5, 5);
        toolbarHandle.initialText(creditText, cashManager.getCurrentMoney(), betText, messageText);
    }


    @FXML
    private void bagaReleased() {
        if (!isRolling && (cashManager.getCurrentMoney() != 0 && (cashManager.getCurrentMoney() - cashManager.getCurrentBet()) >= 0)  || cashManager.getCurrentWin() != 0) {

            isRolling = true;
            isFalit = false;

            toolbarHandle.minusCredit(creditText, cashManager);


            winText.setOpacity(0);
            if (doubleButton.getOpacity() == 1) {
                transition.fade(doubleButton, 1, 0, 150);
            }

            messageText.setText("Bafta Boss");
            barHandles.changeText(slot1, slot2, slot3, slot4, slot5);
            //debugSet.fullLineDebug(slot1, slot2, slot3, slot4, slot5);
            //debugSet.fourLineDebug(slot1, slot2, slot3, slot4, slot5);
            //debugSet.nextFirstLineDebug(slot1, slot2, slot3, slot4, slot5);

            barHandles.assignThumbs(slot1, slot2, slot3, slot4, slot5);
            transition.scrollInstantly(barScroll1, barScroll2, barScroll3, barScroll4, barScroll5);

            audioPlayer.playRoll();
            linePane.getChildren().clear();

            pause(10, barScroll1);
            pause(500, barScroll2);
            pause(250, barScroll3);
            pause(1000, barScroll4);
            pause(1300, barScroll5);

            pause(2500
            );
        } else if (cashManager.getCurrentMoney() == 0 || (cashManager.getCurrentMoney() - cashManager.getCurrentBet()) < 0 && !isFalit ) {
            isFalit = true;
            transition.flash(messageText, "Nu mai este bani, sefule", 150, 50, isFalit);
        }

    }

    void scroll(ScrollPane scrollPane) {


        Animation animation = new Timeline(
                new KeyFrame(Duration.millis(2200),
                        new KeyValue(scrollPane.vvalueProperty(), 1)));
        animation.setOnFinished(actionEvent -> {
            specialEffects.nullEffect(scrollPane);
            Animation animation1 = new Timeline(
                    new KeyFrame(Duration.millis(150),
                            new KeyValue(scrollPane.vvalueProperty(), 0.989)));
            audioPlayer.playClick();
            animation1.play();

        });
        specialEffects.motionBlur(scrollPane, 80, 90);
        animation.play();
    }


    private void pause(int millis, ScrollPane scpane) {
        PauseTransition pauseTransition = new PauseTransition(Duration.millis(millis));
        pauseTransition.setOnFinished(actionEvent -> {
            scroll(scpane);
        });
        pauseTransition.play();
    }

    private void pause(int millis) {
        PauseTransition pauseTransition = new PauseTransition(Duration.millis(millis));
        pauseTransition.setOnFinished(actionEvent -> {
            // ArrayList<Pane> line1 = new ArrayList<>();
            ArrayList<Pane> line2 = new ArrayList<>();
            ArrayList<Pane> line3 = new ArrayList<>();
            ArrayList<Pane> line4 = new ArrayList<>();
            ArrayList<Pane> line5 = new ArrayList<>();
            ArrayList<Pane> line6 = new ArrayList<>();


//            line1.add((Pane) slot1.getChildren().get(94));
//            line1.add((Pane) slot2.getChildren().get(94));
//            line1.add((Pane) slot3.getChildren().get(94));
//            line1.add((Pane) slot4.getChildren().get(94));
//            line1.add((Pane) slot5.getChildren().get(94));


            line2.add((Pane) slot1.getChildren().get(95));
            line2.add((Pane) slot2.getChildren().get(95));
            line2.add((Pane) slot3.getChildren().get(95));
            line2.add((Pane) slot4.getChildren().get(95));
            line2.add((Pane) slot5.getChildren().get(95));


            line3.add((Pane) slot1.getChildren().get(96));
            line3.add((Pane) slot2.getChildren().get(96));
            line3.add((Pane) slot3.getChildren().get(96));
            line3.add((Pane) slot4.getChildren().get(96));
            line3.add((Pane) slot5.getChildren().get(96));

            line4.add((Pane) slot1.getChildren().get(97));
            line4.add((Pane) slot2.getChildren().get(97));
            line4.add((Pane) slot3.getChildren().get(97));
            line4.add((Pane) slot4.getChildren().get(97));
            line4.add((Pane) slot5.getChildren().get(97));

            line5.add((Pane) slot1.getChildren().get(98));
            line5.add((Pane) slot2.getChildren().get(98));
            line5.add((Pane) slot3.getChildren().get(98));
            line5.add((Pane) slot4.getChildren().get(98));
            line5.add((Pane) slot5.getChildren().get(98));

            line6.add((Pane) slot1.getChildren().get(99));
            line6.add((Pane) slot2.getChildren().get(99));
            line6.add((Pane) slot3.getChildren().get(99));
            line6.add((Pane) slot4.getChildren().get(99));
            line6.add((Pane) slot5.getChildren().get(99));

            for (Node node : line2) {
                node.setStyle("");
            }
            for (Node node : line3) {
                node.setStyle("");
            }
            for (Node node : line4) {
                node.setStyle("");
            }
            for (Node node : line5) {
                node.setStyle("");
            }
            for (Node node : line6) {
                node.setStyle("");
            }

//            compare(line1);
            compare(line2, 1);
            compare(line3, 2);
            compare(line4, 3);
            compare(line5, 4);
            compare(line6, 5);
            isRolling = false;
        });
        pauseTransition.play();
    }


    String color(int lineNo) {
        switch (lineNo) {
            case 1:
                return "CYAN";

            case 2:
                return "LIGHTBLUE";

            case 3:
                return "BLUE";

            case 4:
                return "PINK";

            case 5:
                return "MAGENTA";
            case 6:
                return "RED";

            default:
                throw new IllegalStateException("Unexpected value: " + lineNo);
        }
    }


    private void compare(ArrayList<Pane> bars, int line) {

//        bars.get(0).setStyle("");
//        bars.get(1).setStyle("");
//        bars.get(2).setStyle("");
//        bars.get(3).setStyle("");
//        bars.get(4).setStyle("");

        FlowPane flowPane = (FlowPane) bars.get(0).getChildren().get(0);
        FlowPane flowPane1 = (FlowPane) bars.get(1).getChildren().get(0);
        FlowPane flowPane2 = (FlowPane) bars.get(2).getChildren().get(0);
        FlowPane flowPane3 = (FlowPane) bars.get(3).getChildren().get(0);
        FlowPane flowPane4 = (FlowPane) bars.get(4).getChildren().get(0);


        Text text = (Text) flowPane.getChildren().get(0);
        Text text1 = (Text) flowPane1.getChildren().get(0);
        Text text2 = (Text) flowPane2.getChildren().get(0);
        Text text3 = (Text) flowPane3.getChildren().get(0);
        Text text4 = (Text) flowPane4.getChildren().get(0);

        if (checkers.lineOfFive(text, text1, text2, text3, text4)) {
            uiSpawner.lineDrawer(linePane, (LineDims) dimLists.lines.get(line - 1).get(5), line);
            cashManager.calculateWin(false, false, true, cashManager.winType(text.getText()));
            bars.get(0).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(1).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(2).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(3).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(4).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");

        } else if (checkers.firstFour(text, text1, text2, text3) && !checkers.lineOfFive(text, text1, text2, text3, text4)) {
            uiSpawner.lineDrawer(linePane, (LineDims) dimLists.lines.get(line - 1).get(3), line);
            cashManager.calculateWin(false, true, false, cashManager.winType(text.getText()));
            bars.get(0).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(1).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(2).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(3).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");

        } else if (checkers.firstFour(text1, text2, text3, text4) && !checkers.lineOfFive(text, text1, text2, text3, text4)) {
            cashManager.calculateWin(false, true, false, cashManager.winType(text.getText()));
            bars.get(1).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(2).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(3).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(4).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");

            uiSpawner.lineDrawer(linePane, (LineDims) dimLists.lines.get(line - 1).get(4), line);


        } else if (checkers.firstThree(text, text1, text2)
                && !checkers.lineOfFive(text, text1, text2, text3, text4)
                && !checkers.lineOfFour(text, text1, text2, text3, text4)) {
            cashManager.calculateWin(true, false, false, cashManager.winType(text.getText()));
            bars.get(0).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(1).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(2).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");


            uiSpawner.lineDrawer(linePane, (LineDims) dimLists.lines.get(line - 1).get(0), line);
        } else if (checkers.firstThree(text1, text2, text3)
                && !checkers.lineOfFive(text, text1, text2, text3, text4)
                && !checkers.lineOfFour(text, text1, text2, text3, text4)) {
            cashManager.calculateWin(true, false, false, cashManager.winType(text.getText()));
            bars.get(1).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(2).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(3).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");

            uiSpawner.lineDrawer(linePane, (LineDims) dimLists.lines.get(line - 1).get(1), line);
        } else if (checkers.firstThree(text2, text3, text4) &&
                !checkers.lineOfFive(text, text1, text2, text3, text4)
                && !checkers.lineOfFour(text, text1, text2, text3, text4)) {
            cashManager.calculateWin(true, false, false, cashManager.winType(text.getText()));
            bars.get(2).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(3).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            bars.get(4).setStyle("-fx-border-color: " + color(line) + "; -fx-border-width: 5;");
            uiSpawner.lineDrawer(linePane, (LineDims) dimLists.lines.get(line - 1).get(2), line);
        }


        if (checkers.lineOfFive(text, text1, text2, text3, text4)) {

            messageText.setText(cashManager.currentWinToString());
            win(3);
        } else if (checkers.lineOfFour(text, text1, text2, text3, text4)
                && !checkers.lineOfFive(text, text1, text2, text3, text4)) {
            messageText.setText(cashManager.currentWinToString());
            win(1);
        } else if (checkers.lineOfThree(text, text1, text2, text3, text4) &&
                !checkers.lineOfFive(text, text1, text2, text3, text4)
                && !checkers.lineOfFour(text, text1, text2, text3, text4)) {
            messageText.setText(cashManager.currentWinToString());
            win(2);
        }

    }

    @FXML
    private void doubleReleased() {
        Runnable runnable = () -> {
            specialEffects.nullEffect(doublePane);
        };
        transition.yAxisSlide(doublePane, -1000, -3, 350, runnable);

        transition.fillTransitionBlue(50, epilepsyPane);
        specialEffects.motionBlur(doublePane, 80, 90);
    }

    @FXML
    private void minusReleased() {
        toolbarHandle.minusBet(betText, cashManager);
    }

    @FXML
    private void plusReleased() {
        toolbarHandle.plusBet(betText, cashManager);
    }

    private void win(int win) {
        switch (win) {
            case 1:
                audioPlayer.playWin();
                isStopped = false;
                transition.fade(doubleButton, 0, 1, 250);
                //transition.textEpilepsyRB(winText, 15, isStopped);
                break;
            case 2:
                audioPlayer.playLittleWin();
                isStopped = false;
                transition.fade(doubleButton, 0, 1, 250);

                //transition.textEpilepsyRB(winText, 15, isStopped);
                break;

            case 3:
                audioPlayer.playJackpot();
                isStopped = false;
                transition.fade(doubleButton, 0, 1, 250);

                //transition.textEpilepsyRB(winText, 15, isStopped);
                break;
        }
    }

}
