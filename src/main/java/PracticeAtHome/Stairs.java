package PracticeAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stairs {
    // Complete the staircase function below.
    static void staircase(int n) {
        char[][] picture=new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                picture[0][3]='#';
                picture[1][2]='#';
                picture[1][3]='#';
                picture[2][1]='#';
                picture[2][2]='#';
                picture[2][3]='#';
                picture[3][0]='#';
                picture[3][1]='#';
                picture[3][2]='#';
                picture[3][3]='#';



            }



        }
        System.out.println(Arrays.deepToString(picture));
            }











    public static void main(String[] args) {
        staircase(4);
    }
}
