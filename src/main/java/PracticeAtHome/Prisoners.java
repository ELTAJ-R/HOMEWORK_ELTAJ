package PracticeAtHome;

public class Prisoners {
    // Complete the saveThePrisoner function below.
    static Long saveThePrisoner(int prisoners, int sweets, int startPoint) {
        int wanted = 0;
        sweets--;
        while (sweets > prisoners) {

            sweets = sweets % prisoners;

        }
        if (startPoint + sweets > prisoners) {
            return Long.valueOf(startPoint + sweets - prisoners);
        } else return Long.valueOf(startPoint + sweets);


    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(800000000, 1605000000, 4000000));
        ;

    }

}
