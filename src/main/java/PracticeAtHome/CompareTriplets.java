package PracticeAtHome;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int firstCount = 0;
        int secondCount = 0;


        for (int j = 0; j < b.size(); j++) {
            if (a.get(j) > b.get(j)) firstCount++;
            else if (a.get(j) < b.get(j)) secondCount++;

        }

        List<Integer> result = Arrays.asList(firstCount, secondCount);
        return result;


    }

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(3, 1, 2);
        List<Integer> second = Arrays.asList(2, 2, 2);
        System.out.println(compareTriplets(first, second));

    }
}
