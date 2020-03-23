package PracticeAtHome;

public class Methods {


    int countDigit = 0;
    int countLetter = 0;


    public void checkPassword(String password) {
        password.toUpperCase();

        if (password.length() >= 10) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    countDigit++;
                } else if (Character.isLetter(password.charAt(i))) {
                    countLetter++;
                } else {
                    System.out.println("Be aware that there is unidentified symbol in your password");
                    break;
                }
            }
            if (countDigit >= 2 && countLetter >= 2) {
                System.out.println("Your password is valid");
            } else System.out.println("Your password must contain at least 2 digits and letters");
        } else {
            System.out.println("Length is not long enough");
        }

    }
}








