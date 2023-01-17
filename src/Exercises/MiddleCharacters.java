package Exercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        printMiddleCharacters(inputText);


    }

    private static void printMiddleCharacters(String text) {

        if (text.length() % 2 == 1) {
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        } else {
            int indexFirst = text.length() / 2;
            int indexSecond = text.length() / 2 - 1;
            System.out.println("" + text.charAt(indexFirst) + text.charAt(indexSecond));

        }
    }
}
