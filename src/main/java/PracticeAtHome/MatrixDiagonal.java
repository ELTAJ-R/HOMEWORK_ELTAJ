package PracticeAtHome;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MatrixDiagonal {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstSum = 0;
        int secondSum = 0;
        Integer size = arr.stream().filter(a -> a.size() == 1).findFirst().get().get(0);
        int j = size;
        for (int i = 1; i <= size; i++) {
            firstSum = firstSum + arr.get(i).get(i - 1);
            secondSum = secondSum + arr.get(i).get(j - 1);
            j--;
        }
        return Math.abs(firstSum - secondSum);

    }


    public static void main(String[] args) {
        List<Integer> additional = Arrays.asList(4);
        List<Integer> first = new Random().ints(-15, 10)
                .limit(4).boxed().collect(Collectors.toList());
        List<Integer> second = new Random().ints(-15, 10)
                .limit(4).boxed().collect(Collectors.toList());
        List<Integer> third = new Random().ints(-15, 10)
                .limit(4).boxed().collect(Collectors.toList());
        List<Integer> fourth = new Random().ints(-15, 10)
                .limit(4).boxed().collect(Collectors.toList());
        List<List<Integer>> finalVer = Arrays.asList(additional, first, second, third, fourth);
        for (List<Integer> el : finalVer) {
            System.out.printf("%s\n", el.toString());
        }

        System.out.println(diagonalDifference(finalVer));
    }
}
