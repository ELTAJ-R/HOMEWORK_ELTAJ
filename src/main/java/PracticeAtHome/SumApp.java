package PracticeAtHome;

import java.util.Random;

public class SumApp {
//    static int simpleArraySum(int[] ar) {
//       return sumApp(ar,ar[0]);
//    }
//
//  static   int sumApp(int [] ar,int el){
//        int index=0;
//
//        if(ar.length==0) return 0;
//
//     if(index==ar.length) return 0;
//     else if(index<ar.length) return sumApp(ar,ar[index+1]);
//
//
//    }


    public static void main(String[] args) {
        int[] example = new Random().ints(1, 10).limit(10).toArray();
        for (int el:example) {
            System.out.printf("Element:%d ",el);
        }
//        System.out.printf( "\nSum:%d ",simpleArraySum(example));
    }}
