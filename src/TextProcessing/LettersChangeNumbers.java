package TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double totalSum = 0;
        String[] codes = input.split("\\s+");

        for (String code : codes) {
            double number = getModifireNum(code);

            totalSum += number;
        }

        System.out.printf("%.2f", totalSum);
    }

    private static double getModifireNum(String code) {

        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);

        double number = Double.parseDouble(code.replace(firstLetter, ' ')
                .replace(secondLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)) {
            int positionUpperLetter = (int) firstLetter - 64;
            number /= positionUpperLetter;
        } else {
            int positionLowerCase = (int) firstLetter - 96;
            number *= positionLowerCase;
        }

        if (Character.isUpperCase(secondLetter)) {
            int positionUpperCase = (int) secondLetter - 64;
            number -= positionUpperCase;
        } else {
            int positionLowerCase = (int) secondLetter - 96;
            number += positionLowerCase;
        }

        return number;
    }
}
