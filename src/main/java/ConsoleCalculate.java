

import java.util.Scanner;

public class ConsoleCalculate {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            String operations = scanner.nextLine();
            if (operations.contains(String.valueOf('+'))) {


                String first = operations.substring(0, operations.indexOf('+'));
                String second = operations.substring(operations.indexOf('+') + 1);
                int a = Integer.parseInt(first);
                int b = Integer.parseInt(second);
                System.out.println(a + b);
            }


            if (operations.contains(String.valueOf('-'))) {


                String first = operations.substring(0, operations.indexOf('-'));
                String second = operations.substring(operations.indexOf('-') + 1);
                int a = Integer.parseInt(first);
                int b = Integer.parseInt(second);
                System.out.println(a - b);
            }

            if (operations.contains(String.valueOf('*'))) {


                String first = operations.substring(0, operations.indexOf('*'));
                String second = operations.substring(operations.indexOf('*') + 1);
                int a = Integer.parseInt(first);
                int b = Integer.parseInt(second);
                System.out.println(a * b);
            }

            if (operations.contains(String.valueOf('/'))) {


                String first = operations.substring(0, operations.indexOf('/'));
                String second = operations.substring(operations.indexOf('/') + 1);
                int a = Integer.parseInt(first);
                int b = Integer.parseInt(second);
                System.out.println(a / b);
            }
            if (operations.contains("quit")) {
                System.out.println("finished");
                break;
            }
        }


    }


}













