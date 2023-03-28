package TESTS;

import java.util.Scanner;

public class newPasswordDidoTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = scan.nextLine();

        System.out.println(newPassword(a,b));

    }


    public static String newPassword(String stringA, String stringB) {

        StringBuilder newWord = new StringBuilder();

        int shortestIndex = 0;
        String longestString = "";
        if (stringA.length() >= stringB.length()) {
            longestString = stringA;
            shortestIndex = stringB.length();
        } else {
            shortestIndex = stringA.length();
            longestString = stringB;
        }

        for (int i = 0; i < shortestIndex; i++) {

            newWord.append(stringA.charAt(i));
            newWord.append(stringB.charAt(i));

            if (i == shortestIndex - 1) {
                newWord.append(longestString.substring(shortestIndex));
            }
        }

        return newWord.toString();

    }
}
