package misc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import paths.Images;

import java.util.ArrayList;
import java.util.concurrent.Executors;

public class BarHandles {

    private final ObservableList<String> thumbs = FXCollections.observableArrayList("Lebenita", "Septar", "Lamai", "Stele", "Prunie");
    private final Images images = new Images();
    private final UISpawner uiSpawner = new UISpawner();


    private void changeText(VBox slot) {
        for (int i = 0; i < slot.getChildren().size(); i++) {
            Pane pane = (Pane) slot.getChildren().get(i);
            FlowPane flowPane = (FlowPane) pane.getChildren().get(0);
            Text text = (Text) flowPane.getChildren().get(0);
            text.setText(thumbs.get((int) (Math.random() * thumbs.size())));
        }
    }

    private void assignThumbs(VBox slot) {
        for (Node node : slot.getChildren()) {
            Pane pane = (Pane) node;
            FlowPane flowPane = (FlowPane) pane.getChildren().get(0);
            Text text = (Text) flowPane.getChildren().get(0);
            ImageView imageView = (ImageView) pane.getChildren().get(1);

            switch (text.getText()) {
                case "Lebenita":
                    imageView.setImage(images.images.get(0));
                    break;
                case "Septar":
                    imageView.setImage(images.images.get(1));
                    break;
                case "Lamai":
                    imageView.setImage(images.images.get(2));
                    break;
                case "Stele":
                    imageView.setImage(images.images.get(3));
                    break;
                case "Prunie":
                    imageView.setImage(images.images.get(4));
                    break;
            }
        }
    }

    public void assignThumbs(VBox vBox, VBox vBox1, VBox vBox2, VBox vBox3, VBox vBox4) {
        assignThumbs(vBox);
        assignThumbs(vBox1);
        assignThumbs(vBox2);
        assignThumbs(vBox3);
        assignThumbs(vBox4);

    }

    public void changeText(VBox vBox, VBox vBox1, VBox vBox2, VBox vBox3, VBox vBox4) {
        changeText(vBox);
        changeText(vBox1);
        changeText(vBox2);
        changeText(vBox3);
        changeText(vBox4);

    }


    public void initialAssign(VBox vBox, VBox vBox1, VBox vBox2, VBox vBox3, VBox vBox4, int spacing) {
        vBox.setSpacing(spacing);
        vBox1.setSpacing(spacing);
        vBox2.setSpacing(spacing);
        vBox3.setSpacing(spacing);
        vBox4.setSpacing(spacing);

        for (int i = 0; i < 101; i++) {
            uiSpawner.dynamicBar(vBox);
            uiSpawner.dynamicBar(vBox1);
            uiSpawner.dynamicBar(vBox2);
            uiSpawner.dynamicBar(vBox3);
            uiSpawner.dynamicBar(vBox4);

        }

        assignThumbs(vBox, vBox1, vBox2, vBox3, vBox4);
    }

    public ArrayList<Pane> line(VBox vBox, VBox vBox1, VBox vBox2, VBox vBox3, VBox vBox4, int lineNo) {
        ArrayList<Pane> line = new ArrayList<>();

        switch (lineNo) {
            case 1:
                line.add((Pane) vBox.getChildren().get(94));
                line.add((Pane) vBox1.getChildren().get(94));
                line.add((Pane) vBox2.getChildren().get(94));
                line.add((Pane) vBox3.getChildren().get(94));
                line.add((Pane) vBox4.getChildren().get(94));

                return line;
            case 2:
                line.add((Pane) vBox.getChildren().get(95));
                line.add((Pane) vBox1.getChildren().get(95));
                line.add((Pane) vBox2.getChildren().get(95));
                line.add((Pane) vBox3.getChildren().get(95));
                line.add((Pane) vBox4.getChildren().get(95));

                return line;

            case 3:
                line.add((Pane) vBox.getChildren().get(96));
                line.add((Pane) vBox1.getChildren().get(96));
                line.add((Pane) vBox2.getChildren().get(96));
                line.add((Pane) vBox3.getChildren().get(96));
                line.add((Pane) vBox4.getChildren().get(96));

                return line;
            case 4:
                line.add((Pane) vBox.getChildren().get(97));
                line.add((Pane) vBox1.getChildren().get(97));
                line.add((Pane) vBox2.getChildren().get(97));
                line.add((Pane) vBox3.getChildren().get(97));
                line.add((Pane) vBox4.getChildren().get(97));

                return line;
            case 5:
                line.add((Pane) vBox.getChildren().get(98));
                line.add((Pane) vBox1.getChildren().get(98));
                line.add((Pane) vBox2.getChildren().get(98));
                line.add((Pane) vBox3.getChildren().get(98));
                line.add((Pane) vBox4.getChildren().get(98));

                return line;
            case 6:
                line.add((Pane) vBox.getChildren().get(99));
                line.add((Pane) vBox1.getChildren().get(99));
                line.add((Pane) vBox2.getChildren().get(99));
                line.add((Pane) vBox3.getChildren().get(99));
                line.add((Pane) vBox4.getChildren().get(99));

                return line;
            default:
                return line;
        }


    }
}
