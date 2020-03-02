import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class SentenceBuilding {

    public static void main(String[] args) {
        List<String> subjects = Arrays.asList("Noel", "The cat", "The dog");
        List<String> verbs = Arrays.asList("wrote", "chased", "slept on");
        List<String> objects = Arrays.asList("the book", "the ball", "the bed");
        for (String el : subjects) {
            for (String verb : verbs) {
                for (String ob : objects) {

                    System.out.println(el + " " + verb + " " + ob);

                }

            }
        }
    }
}