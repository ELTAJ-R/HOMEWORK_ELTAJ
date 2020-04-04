package PracticeAtHome;

import java.util.StringJoiner;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        StringJoiner sj = new StringJoiner(":", "", "");
        String[] hm = s.split(":");
        int result = hm[0].compareToIgnoreCase("12");
        CharSequence ch = hm[2].subSequence(0, 2);
        if (s.contains("PM")) {

            if (result==0) {



            }
            if (result!=0) {
                hm[0] = String.valueOf(Integer.parseInt(hm[0]) + 12);

            }

            sj.add(hm[0]);
            sj.add(hm[1]);
            sj.add(ch);
        } else if (s.contains("AM")) {

            if (result==0) {
                hm[0] = "00";

            }
            sj.add(hm[0]);
            sj.add(hm[1]);
            sj.add(ch);
        }


        return sj.toString();

    }

    public static void main(String[] args) {
        String s = "12:00:00PM";
        System.out.println(timeConversion(s));
        ;
    }
}
