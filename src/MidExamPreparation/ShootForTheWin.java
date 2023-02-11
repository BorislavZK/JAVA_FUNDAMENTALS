package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[1]);

        }

        String coordinates = scan.nextLine();

        while (!coordinates.equals("End")) {

            int target = Integer.parseInt(coordinates);
            if (target >= 0 && target < numbers.length){

            }


                coordinates = scan.nextLine();
        }


    }
}
