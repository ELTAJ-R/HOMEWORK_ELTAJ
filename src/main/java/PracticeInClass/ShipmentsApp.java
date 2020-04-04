package PracticeInClass;

import java.util.ArrayList;
import java.util.List;

public class ShipmentsApp {

    static int fix(int[] w) {
        int moves = 0;
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += w[i];

        }
        int equal = sum / w.length;
        if (sum % w.length == 0) {
            for (int i = 0; i < w.length; i++) {

                if (w[i] == equal) {
                } else if (w[i] > equal) {
                    moves += w[i] - equal;

                }
            }
            return moves;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] a1 = {1, 1, 1, 1, 6};
        int[] a2 = {1, 1, 1, 1, 16};
        int[] a3 = {1, 1, 1, 1, 15};
        int[] a4 = {10, 20, 2, 3, 15};
        System.out.println(fix(a1)); // 4
        System.out.println(fix(a2)); // 12
        System.out.println(fix(a3)); // -1
        System.out.println(fix(a4)); // 15
    }
}
