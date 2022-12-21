package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int oddSum = 0;
        int evenSum = 0;

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int number : numbers) {

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
