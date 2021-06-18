package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


import java.util.ArrayList;
import java.util.Objects;

public class Bar {

    ObservableList<String> thumbs = FXCollections.observableArrayList("Lebenita","Septar","Lamai","Stele","Prunie");




    @FXML
    private Pane barPane;
    @FXML
    private Text thumbText;
    @FXML
    private ImageView imageView;

    @FXML
    private void initialize() {

        int random = (int) (Math.random() * 5);

        thumbText.setText(thumbs.get(random));
       // imageView.setImage(images.get(random));


    }

}
