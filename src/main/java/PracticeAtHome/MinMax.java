package PracticeAtHome;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        List<Long> ints = new ArrayList<>();
        for (long el : arr) {

            ints.add(el);
        }
        long max = ints.stream().sorted().max(Long::compareTo).get().longValue();
        long min = ints.stream().sorted().min(Long::compareTo).get().longValue();


        long sumOfGeneral = 0;

        for (long el : ints) {
            sumOfGeneral += el;
        }
        long sumOfMax = sumOfGeneral - min;
        long sumOfMin = sumOfGeneral - max;


        System.out.printf("%d %d", sumOfMin, sumOfMax);
    }

    public static void main(String[] args) {
        int[] examp = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        miniMaxSum(examp);
    }
}
