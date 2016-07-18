import model.*;

public class TypingMain {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(RndString.getWord());
            i++;
        }
    }
}
