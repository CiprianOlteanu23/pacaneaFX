package misc.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DimLists {


    private final ObservableList<LineDims> line5 = FXCollections.observableArrayList(new LineDims(1000, 815, -770, 8, 97, 8),
            new LineDims(1310, 815, -770, 8, 97, 8),
            new LineDims(1610, 815, -770, 8, 97, 8),
            new LineDims(1000, 815, -770, 8, 424, 8),
            new LineDims(1300, 815, -770, 8, 424, 8),
            new LineDims(1000, 815, -770, 8, 424, 8));

    private final ObservableList<LineDims> line4 = FXCollections.observableArrayList(new LineDims(1000, 673, -770, 8, 97, 8),
            new LineDims(1310, 673, -770, 8, 97, 8),
            new LineDims(1610, 673, -770, 8, 97, 8),
            new LineDims(1000, 673, -770, 8, 424, 8),
            new LineDims(1300, 673, -770, 8, 424, 8),
            new LineDims(1000, 673, -770, 8, 424, 8));

    private final ObservableList<LineDims> line3 = FXCollections.observableArrayList(new LineDims(1000, 528, -770, 8, 97, 8),
            new LineDims(1310, 528, -770, 8, 97, 8),
            new LineDims(1610, 528, -770, 8, 97, 8),
            new LineDims(1000, 528, -770, 8, 424, 8),
            new LineDims(1300, 528, -770, 8, 424, 8),
            new LineDims(1000, 528, -770, 8, 424, 8));

    private final ObservableList<LineDims> line2 = FXCollections.observableArrayList(new LineDims(1000, 381, -770, 8, 97, 8),
            new LineDims(1310, 381, -770, 8, 97, 8),
            new LineDims(1610, 381, -770, 8, 97, 8),
            new LineDims(1000, 381, -770, 8, 424, 8),
            new LineDims(1300, 381, -770, 8, 424, 8),
            new LineDims(1000, 381, -770, 8, 424, 8));

    private final ObservableList<LineDims> line1 = FXCollections.observableArrayList(new LineDims(1000, 234, -770, 8, 97, 8),
            new LineDims(1310, 234, -770, 8, 97, 8),
            new LineDims(1610, 234, -770, 8, 97, 8),
            new LineDims(1000, 234, -770, 8, 424, 8),
            new LineDims(1300, 234, -770, 8, 424, 8),
            new LineDims(1000, 234, -770, 8, 424, 8));

    public final ObservableList<ObservableList> lines = FXCollections.observableArrayList(line1, line2, line3, line4, line5);

}
