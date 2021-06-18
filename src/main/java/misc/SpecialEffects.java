package misc;

import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.MotionBlur;


public class SpecialEffects {

    public void motionBlur(ScrollPane scrollPane, int radius, int angle) {
        MotionBlur motionBlur = new MotionBlur(angle, radius);
        for (Node node : scrollPane.getChildrenUnmodifiable()) {
            node.setEffect(motionBlur);
        }
    }

    public void motionBlur(Node node, int radius, int angle) {
        MotionBlur motionBlur = new MotionBlur(angle, radius);
        node.setEffect(motionBlur);
    }

    public void nullEffect(ScrollPane scrollPane) {

        for (Node node : scrollPane.getChildrenUnmodifiable()) {
            node.setEffect(null);
        }
    }

    public void nullEffect(Node node) {
        node.setEffect(null);
    }

}
