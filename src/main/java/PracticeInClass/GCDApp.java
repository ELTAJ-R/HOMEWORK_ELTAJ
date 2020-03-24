package PracticeInClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GCDApp {
    public int gcd(int a, int b) {
        List<Integer> division = new ArrayList<>();

        if (a < b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    division.add(i);
                }
            }

        } else {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    division.add(i);
                }
            }

        }
        return Collections.max(division);
    }
}
