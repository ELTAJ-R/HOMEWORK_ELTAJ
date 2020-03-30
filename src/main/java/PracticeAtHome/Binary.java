package PracticeAtHome;


import java.util.ArrayList;


public class Binary {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Object> binary = converter(888777);
        binary.forEach(a -> sb.append(a));
        String str = sb.toString();
        System.out.println(str);


    }


    static ArrayList<Object> converter(int number) {
        ArrayList<Integer> ints = new ArrayList<>();

        while (number != 0) {
            int remainder = number % 2;
            ints.add(remainder);
            number = number / 2;
        }
        return Reverse.reverse(ints);


    }}


//   static int calculator(String string){
//        int countOne=0;
//        int countZero=0;
//        for (int i=0;i<string.length();i++){
//        char current=string.charAt(i);
//        char next=string.charAt(i+1);
//        while(current=='0' && next=='0'){
//
//        }
//        }
//        }}


//        switch (current){
//            case '1':countOne++;break;
//            case '0':countZero++;break;
//
//        }


