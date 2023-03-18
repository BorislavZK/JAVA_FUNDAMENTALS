package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        char[] firstWord = input[0].toCharArray();
        char[] secondWord = input[1].toCharArray();

        int longestArray = Math.max(firstWord.length, secondWord.length);
        int shortestArray = Math.min(firstWord.length, secondWord.length);

        int totalSum = 0;

        for (int i = 0; i < longestArray; i++) {
            if (i < shortestArray) {
                totalSum += firstWord[i] * secondWord[i];
            } else if (firstWord.length > secondWord.length) {
                totalSum += firstWord[i];
            } else {
                totalSum += secondWord[i];
            }
        }
        System.out.println(totalSum);
    }
}
