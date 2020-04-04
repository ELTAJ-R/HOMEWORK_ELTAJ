package PracticeAtHome;

import java.util.*;


public class MigratoryBirds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        LinkedList<Integer> repetitions = new LinkedList<>();
        arr.stream().sorted().forEach(a -> repetitions.add(Collections.frequency(arr, a)));
        int maxRepeat = repetitions.stream().sorted((a, b) -> (b - a)).findFirst().get();
        int result = arr.stream().filter(a -> maxRepeat == Collections.frequency(arr, a))
                .distinct().sorted().min(Integer::compareTo).get();

        return result;
    }

    public static void main(String[] args) {
        List<Integer> test =
                Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5, 5, 5, 20, 20, 1, 1, 1, 2, 3, 5, 67, 89, 7, 4, 23, 57, 8, 5);
        System.out.println(migratoryBirds(test));
    }
}
