package TextProcessing;

import java.util.Scanner;

public class digitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String letters = "";
        String numbers = "";
        String symbols = "";
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar)) {
                letters += currentChar;
            } else if (Character.isDigit(currentChar)) {
                numbers += currentChar;
            } else {
                symbols += currentChar;
            }
        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
