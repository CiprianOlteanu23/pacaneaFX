package misc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class DebugSet {

    private final ObservableList<String> thumbs = FXCollections.observableArrayList("Lebenita", "Septar", "Lamai", "Stele", "Prunie");


    private void lastIsLebenita(VBox slot, ObservableList<String> thumbs) {
        for (int i = 0; i < slot.getChildren().size() - 1; i++) {
            Pane pane = (Pane) slot.getChildren().get(i);
            FlowPane flowPane = (FlowPane) pane.getChildren().get(0);
            Text text = (Text) flowPane.getChildren().get(0);
            text.setText(thumbs.get((int) (Math.random() * thumbs.size())));
        }
        Pane pane = (Pane) slot.getChildren().get(99);
        FlowPane flowPane = (FlowPane) pane.getChildren().get(0);
        Text text = (Text) flowPane.getChildren().get(0);
        text.setText(thumbs.get(0));
    }

    public void fullLineDebug(VBox slot,VBox slot1, VBox slot2,VBox slot3,VBox slot4){

        lastIsLebenita(slot, thumbs);
        lastIsLebenita(slot1, thumbs);
        lastIsLebenita(slot2, thumbs);
        lastIsLebenita(slot3, thumbs);
        lastIsLebenita(slot4, thumbs);

    }

    public void fourLineDebug(VBox slot,VBox slot1, VBox slot2,VBox slot3, VBox slot4){

        lastIsLebenita(slot, thumbs);
        lastIsLebenita(slot1, thumbs);
        lastIsLebenita(slot2, thumbs);
        lastIsLebenita(slot3, thumbs);


    }

    public void firstLineDebug(VBox slot,VBox slot1, VBox slot2,VBox slot3, VBox slot4){

        lastIsLebenita(slot, thumbs);
        lastIsLebenita(slot1, thumbs);
        lastIsLebenita(slot2, thumbs);
        //lastIsLebenita(slot3, thumbs);


    }
    public void nextFirstLineDebug(VBox slot,VBox slot1, VBox slot2,VBox slot3, VBox slot4){

        //lastIsLebenita(slot, thumbs);
        lastIsLebenita(slot1, thumbs);
        lastIsLebenita(slot2, thumbs);
        lastIsLebenita(slot3, thumbs);


    }
}
