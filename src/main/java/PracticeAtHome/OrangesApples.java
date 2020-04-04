package PracticeAtHome;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrangesApples {
    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        List<Integer> appl = new ArrayList<>();
        for (int el : apples) {
            appl.add(el + a);
        }
        List<Integer> org = new ArrayList<>();
        for (int el : oranges) {
            org.add(el + b);
        }
        int numOfApple = appl.stream().filter(z -> z >= s).filter(d -> d <= t)
                .collect(Collectors.toList()).size();
        int numOfOranges = org.stream().filter(z -> z >= s).filter(d -> d <= t)
                .collect(Collectors.toList()).size();
        System.out.println(numOfApple);
        System.out.println(numOfOranges);


    }
}
