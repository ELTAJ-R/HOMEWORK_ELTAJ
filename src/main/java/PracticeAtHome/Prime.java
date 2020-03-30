package PracticeAtHome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Prime {
    public static void main(String[] args) {
        System.out.println(calculatePrimeLessThan(1000));

    }


    static int calculatePrimeLessThan(int beginning) {
        ArrayList<Integer> mixed = new ArrayList<>();
        for (int a = 2; a < beginning; a++) {
            for (int b = 2; b < beginning; b++) {
                if (a % b == 0) {
                    mixed.add(a);

                }
            }
        }
        return mixed.stream().filter(a -> Collections.frequency(mixed, a) == 1).
                collect(Collectors.toList()).size();


    }
}
