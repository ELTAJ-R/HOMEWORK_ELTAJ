package PracticeAtHome;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int counterPlus = 0;
        int counterMinus = 0;
        int counterZero = 0;
        DecimalFormat formatter = new DecimalFormat("0.000000");

        for (int el : arr) {
            if (el > 0) counterPlus++;
            else if (el < 0) counterMinus++;
            else counterZero++;
        }
        String plus = formatter.format((double) counterPlus / arr.length);
        String minus = formatter.format((double) counterMinus / arr.length);
        String zero = formatter.format((double) counterZero / arr.length);


        List<String> result = Arrays.asList(plus, minus, zero);
        result.forEach(System.out::println);


    }

    public static void main(String[] args) {
        int[] example = new Random().ints(-10, 10).limit(10).toArray();
        for (int el : example) {
            System.out.print(el + "  \n");
        }
        plusMinus(example);
    }
}
