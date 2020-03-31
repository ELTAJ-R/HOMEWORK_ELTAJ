package PracticeAtHome;


import java.util.Random;


public class AnotherSum {
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (long el : ar) {
            sum = sum + el;

        }

        return sum;

    }

    public static void main(String[] args) {
        long[] nums = new Random().ints(100000000, 200000000)
                .limit(1000)
                .mapToLong(a -> (long) a).toArray();
        System.out.println(aVeryBigSum(nums));
        ;
    }
}
