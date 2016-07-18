package model;

import java.util.Random;

public class RndString {

    private static String[] words = {"potato", "salad", "is", "not", "a", "filling", "dinner"};
    private static Random rnd = new Random();

    public static String getWord() {
        return words[rnd.nextInt(words.length)];
    }
}
