package model;

import java.util.Random;

public class Word {
    private static String[] words = {"broadchurch", "eye", "controller", "lara", "is", "completely", "useless"};
    private static Random rnd = new Random();
    private static String word;

    public static String get() {
        return word = words[rnd.nextInt(words.length)];
    }
}
