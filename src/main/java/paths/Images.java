package paths;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;

public class Images {

    private final Image LEBENITA = new Image(String.valueOf(getClass().getClassLoader().getResource("drawable/lebenita.jpg")));
    private final Image SEPTAR = new Image(String.valueOf(getClass().getClassLoader().getResource("drawable/septar.jpg")));
    private final Image LAMAI = new Image(String.valueOf(getClass().getClassLoader().getResource("drawable/lamai.jpg")));
    private final Image TALANGA = new Image(String.valueOf(getClass().getClassLoader().getResource("drawable/talanga.jpg")));
    private final Image PRUNE = new Image(String.valueOf(getClass().getClassLoader().getResource("drawable/prune.jpg")));

    public ObservableList<Image> images = FXCollections.observableArrayList(LEBENITA, SEPTAR, LAMAI, TALANGA, PRUNE);


}
