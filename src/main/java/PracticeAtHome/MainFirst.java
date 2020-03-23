package PracticeAtHome;

import java.util.Scanner;

public class MainFirst {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            String password = sc.nextLine();
            Methods m = new Methods();
            m.checkPassword(password);
        }
    }
}
