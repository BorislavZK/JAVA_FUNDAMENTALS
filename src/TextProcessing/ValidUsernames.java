package TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");

        for (String s : input) {

            if (IsUserValid(s)) {
                System.out.println(s);
            }
        }
    }
    public static boolean IsUserValid(String user) {

        if (user.length() < 3 || user.length() > 16) {
            return false;
        }

        for (char symbol : user.toCharArray()) {

            if (!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-') {
                return false;
            }

        }
        return true;
    }
}
