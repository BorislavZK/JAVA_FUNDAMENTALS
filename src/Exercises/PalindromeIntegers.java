package Exercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")){

            int number = Integer.parseInt(input);

            System.out.println(palindromeNumberChecker(number));

            input = scan.nextLine();
        }

    }

    private static boolean palindromeNumberChecker (int num){
        int org = num;
        int rev = 0;

        while (num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return org == rev;

    }
}
