package PracticeInClass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Generate {
    public static void main(String[] args) {

        int[] random = new Random().ints(10, 25)
                .limit(20).toArray();
      ArrayList<Integer>randoms=new ArrayList<>();
        for (int el:random) {
         randoms.add(el);
        }
        randoms.parallelStream().
                forEach(a->
                        System.out.printf("Number of occurences:%d,number:%d\n"
                                ,Collections.frequency(randoms,a),a));

    }
}
