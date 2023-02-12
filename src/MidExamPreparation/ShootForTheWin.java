package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }

        int totalShots = 0;

        String coordinates = scan.nextLine();
        while (!coordinates.equals("End")) {

            int valueOfIndex = 0;
            int target = Integer.parseInt(coordinates);

            if (target >= 0 && target < numbers.length) {  // ifTargetValid method
                valueOfIndex = numbers[target];
                if (numbers[target] != -1) {
                    numbers[target] = -1;
                    totalShots++;
                    for (int i = 0; i < numbers.length; i++) {
                            //REDUCE
                        if (numbers[i] > valueOfIndex && numbers[i] != -1) {
                            numbers[i] -= valueOfIndex;
                        } else if (numbers[i] <= valueOfIndex && numbers[i] != -1) {
                            //INCREASE
                            numbers[i] += valueOfIndex;
                        }
                    }
                }
            }
            coordinates = scan.nextLine();
        }

        System.out.printf("Shot targets: %d -> ",totalShots );

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
