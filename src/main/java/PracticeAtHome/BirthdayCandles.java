package PracticeAtHome;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class BirthdayCandles {
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        ArrayList<Integer> candles = new ArrayList<>();
        for (int el : ar) {
            candles.add(el);
        }
        int max = candles.stream().max(Integer::compareTo).get().intValue();
        return candles.stream().filter(a -> a == max).collect(Collectors.toList()).size();


    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 9, 9, 9, 9, 9,};
        System.out.println(birthdayCakeCandles(array));
        ;
    }

}
