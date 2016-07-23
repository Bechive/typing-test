package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Game {

    private IntegerProperty right = new SimpleIntegerProperty(0);
    private IntegerProperty wrong = new SimpleIntegerProperty(0);
    private StringProperty word = new SimpleStringProperty();

    public Game() {
        word();
    }

    private void word() {
        word.set(Word.get());
    }

    public void check(String input) {
        if (input.equals(word.get())) {
            right.set(right.get() + 1);
            word();
            return;
        }
        wrong.set(wrong.get() + 1);
        word();
    }


    //Getters & Setters
    public StringProperty wordProperty() {return word;}
    public IntegerProperty rightProperty() {return right;}
    public IntegerProperty wrongProperty() {return wrong;}
    public String getWord() {return word.get();}
    public String getRight() {return String.format("Right: %d", right.get()); }
    public String getWrong() {return String.format("Wrong: %d", wrong.get()); }
}
