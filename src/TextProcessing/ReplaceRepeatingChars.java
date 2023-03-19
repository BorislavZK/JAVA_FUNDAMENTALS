package TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scan.nextLine());

        //aaaaabbbbbcdddeeeedssaa

        for (int i = 0; i < input.length() - 1; i++) {  // < input.length() - 1 za da ne grumne
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);


            if (currentChar == nextChar){
                input.deleteCharAt(i);

                i--;
            }

        }

        System.out.println(input);
    }
}