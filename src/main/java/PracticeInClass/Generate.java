package PracticeInClass;

import java.util.*;
import java.util.stream.Collectors;

public class Generate {
    public static void main(String[] args) {
        List<Integer> min = new ArrayList<>();

        int[] random = new Random().ints(10, 25)
                .limit(20).toArray();
        ArrayList<Integer> randoms = new ArrayList<>();
        for (int el : random) {
            randoms.add(el);
        }
        randoms.stream().forEach(a -> System.out.printf("Number of occurences:%d,number:%d\n"
                                , Collections.frequency(randoms, a), a));
        randoms.stream().forEach(a -> min.add(Collections.frequency(randoms, a)));
        int minimal = min.stream().min(Integer::compareTo).get();

        List<Integer> collected = randoms.stream().filter(a -> Collections.frequency(randoms, a) == minimal).collect(Collectors.toList());
        System.out.println(collected);
    }
}
