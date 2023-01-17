package Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if(!isValidLength(input)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if(!isValidContent(input)){
            System.out.println("Password must consist only of letters and digits");
        }

        if (!isValidCountDigit(input)){
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidCountDigit(input) && isValidContent(input) && isValidLength(input)){
            System.out.println("Password is valid");
        }
    }

    private static boolean isValidLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValidContent(String password) {

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidCountDigit(String password) {
        int countDigit = 0;

        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigit++;
            }
        }

        if (countDigit >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
