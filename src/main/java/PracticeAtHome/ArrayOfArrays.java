package PracticeAtHome;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayOfArrays {
    // Complete the formingMagicSquare function below.
    static void formingMagicSquare(int[][] s) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        List<Integer> third = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            first.add(s[0][i]);
            second.add(s[1][i]);
            third.add(s[2][i]);

        }
        List<List<Integer>> wholeList = Arrays.asList(first, second, third);
        Set<Integer> allDifElements = new HashSet<>();
        List<Integer> allElements = new ArrayList<>();
        List<Integer> range = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        wholeList.forEach(a -> a.forEach(b -> allElements.add(b)));
        List<Integer> distinctNums = range.stream().filter(a -> !allElements.contains(a))
                .collect(Collectors.toList());
        allElements.removeAll(allDifElements);
        System.out.println(allElements);


    }

    public static void main(String[] args) {
        int[][] example = new int[][]{{1, 2, 3}, {3, 4, 5}, {5, 6, 7}};
        formingMagicSquare(example);
    }


}
