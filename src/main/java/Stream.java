import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {


    public static void main(String[] args) {
        List<String> subjects = Arrays.asList("Noel", "The cat", "The dog");
        List<String> verbs = Arrays.asList("wrote", "chased", "slept on");
        List<String> objects = Arrays.asList("the book", "the ball", "the bed");
        List<List<String>> combined = Arrays.asList(subjects,verbs,objects);


        combined.stream().flatMap(list->list.stream());






    }}
