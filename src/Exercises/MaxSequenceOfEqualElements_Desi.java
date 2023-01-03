package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_Desi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                length++;

            } else {
                length = 1;
                startIndex = i;
            }

            if (length > maxLength) {
                maxLength = length;
                bestStartIndex = startIndex;
            }

        }

        for (int i = bestStartIndex; i < bestStartIndex + maxLength; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
