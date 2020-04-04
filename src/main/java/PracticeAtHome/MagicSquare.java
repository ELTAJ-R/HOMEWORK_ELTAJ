package PracticeAtHome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class MagicSquare {
    // Complete the formingMagicSquare function below.

    static void formingMagicSquare(int[][] s) {
        List<Integer> allElementsWithDup = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                allElementsWithDup.add(s[i][j]);
            }

        }
        List<Integer> dupNums = allElementsWithDup.stream()
                .filter(a -> Collections.frequency(allElementsWithDup, a) > 1).distinct()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        List<Integer> rangeFromZero = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            rangeFromZero.add(i);
        }
        List<Integer> numsToChangeWith = rangeFromZero.stream()
                .filter(a -> !allElementsWithDup.contains(a)).sorted(Integer::compareTo)
                .collect(Collectors.toList());

        int dif = 0;

        for (int i = 0; i < dupNums.size(); i++) {
            dif += Math.abs(dupNums.get(i) - numsToChangeWith.get(i));
        }
//       return dif;
        System.out.println(dupNums);
        System.out.println(numsToChangeWith);
        System.out.println(dif);
    }


    public static void main(String[] args) {
        int[][] test = new int[][]{{8, 8, 7}, {2, 3, 5}, {1, 9, 3}};
        formingMagicSquare(test);
    }
}
