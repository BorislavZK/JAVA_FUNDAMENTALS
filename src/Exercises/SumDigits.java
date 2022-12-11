package Exercises;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int number = Integer.parseInt(input);

        int sum = 0;

        for (int i = 0; i <= input.length()-1 ; i++) {

            sum += number % 10;
            number /= 10;

        }

        System.out.println(sum);
    }
}
