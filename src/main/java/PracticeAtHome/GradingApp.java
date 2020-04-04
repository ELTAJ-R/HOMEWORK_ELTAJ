package PracticeAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GradingApp {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> afterModification = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38 || (grades.get(i) + 2) % 5 != 0 && (grades.get(i) + 1) % 5 != 0) {
                afterModification.add(grades.get(i));
            } else if (grades.get(i) >= 38 && (grades.get(i) + 2) % 5 == 0) {
                afterModification.add(grades.get(i) + 2);
            } else if (grades.get(i) >= 38 && (grades.get(i) + 1) % 5 == 0) {
                afterModification.add(grades.get(i) + 1);
            }


        }
        return afterModification;
//        List<Integer> afterModification = new ArrayList<>();
//
//        //finding not modified
//
//        grades.stream().filter(a -> a < 38).forEach(a -> afterModification.add(a));
//        grades.stream().filter(a -> a > 38).filter(a -> (a + 2) % 5 != 0)
//                .forEach(c -> afterModification.add(c));
//
//        grades.stream().filter(a -> a >= 38).filter(a -> (a + 2) % 5 == 0).map(b -> b + 2)
//                .forEach(c -> afterModification.add(c));
//        List<Integer> result = afterModification.stream()
//                .sorted((a, b) -> b - a).collect(Collectors.toList());
//        return result;

    }


    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(33, 38, 60, 78, 95, 88, 75, 83, 21, 54);
        System.out.println(gradingStudents(test));


    }
}