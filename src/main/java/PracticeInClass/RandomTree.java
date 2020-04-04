package PracticeInClass;

import java.util.*;
import java.util.stream.Collectors;

public class RandomTree {
    public static void main(String[] args) {
        List<Integer> randNumbers = new Random().ints(10, 50)
                .limit(30).boxed().collect(Collectors.toList());

        ArrayList<Integer> integers = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < randNumbers.size() - 1; i++) {

            integers.add(Integer.sum(randNumbers.get(i), randNumbers.get(i + 1)));
            counter++;

        }
        Integer minSum = integers.stream().min(Integer::compareTo).get();
        System.out.println(randNumbers);
        System.out.println(minSum);
        System.out.println(counter);


    }
}