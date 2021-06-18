package misc;

import javafx.scene.text.Text;

public class Checkers {

    private final BarHandles barHandles = new BarHandles();


    public Boolean lineOfThree(Text text1, Text text2, Text text3, Text text4, Text text5) {


        if (text1.getText().equals(text2.getText())
                && text1.getText().equals(text3.getText())) {
            return true;
        } else if (text2.getText().equals(text3.getText())
                && text2.getText().equals(text4.getText())) {
            return true;
        } else return text3.getText().equals(text4.getText())
                && text3.getText().equals(text5.getText());


    }

    public Boolean firstThree(Text text1, Text text2, Text text3){
        return text1.getText().equals(text2.getText()) && text1.getText().equals(text3.getText());
    }

    public Boolean firstFour(Text text1, Text text2, Text text3, Text text4){
        return text1.getText().equals(text2.getText())
                && text1.getText().equals(text3.getText())
                && text1.getText().equals(text4.getText());
    }

    public Boolean lineOfFour(Text text1, Text text2, Text text3, Text text4, Text text5) {

        if (text1.getText().equals(text2.getText())
                && text1.getText().equals(text3.getText())
                && text1.getText().equals(text4.getText())) {
            return true;
        } else
            return text2.getText().equals(text3.getText())
                    && text2.getText().equals(text4.getText())
                    && text2.getText().equals(text5.getText());

    }

    public Boolean lineOfFive(Text text1, Text text2, Text text3, Text text4, Text text5) {
        return text1.getText().equals(text2.getText())
                && text1.getText().equals(text3.getText())
                && text1.getText().equals(text4.getText())
                && text1.getText().equals(text5.getText());
    }
}
