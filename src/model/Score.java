package model;

import javafx.beans.property.*;

public class Score {
    StringProperty word = new SimpleStringProperty();
    IntegerProperty count = new SimpleIntegerProperty();

    public void start() {
         word.set(RndString.getWord());
    }

    public void checkWord(String input) {
        if (word.get().equals(input)) count.set(count.get() + 1);
    }

    public
}
