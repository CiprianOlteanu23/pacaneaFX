package sample.splash;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import misc.Transition;

public class splashController {

    @FXML
    private Pane splashPane;
    @FXML
    private Text text1;
    @FXML
    private Text text2;

    private final Transition transition = new Transition();

    @FXML
    private void initialize() {
        transition.fade(text1,0,1,500,5000);
        transition.fade(text2,0,1,500,8000);

        transition.fade(splashPane,1,0,400,10000);

    }


}
