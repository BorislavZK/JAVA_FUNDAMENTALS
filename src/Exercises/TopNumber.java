package Exercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        for (int number = 1; number <= input ; number++) {

            if(isSumDivisibleBy8(number) && isOddDigit(number)){
                System.out.println(number);
            }

        }

    }


    private static boolean isSumDivisibleBy8(int number) {
        int sumDigits = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number /= 10;
        }

        return sumDigits % 8 == 0;
    }

    private static boolean isOddDigit(int number){

        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1){
                return true;
            }
            number /= 10;
        }

        return false;
    }
}
