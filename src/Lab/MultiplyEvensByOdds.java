package Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        System.out.println(evenAndOddsNumbers(Math.abs(input)));

    }

    public static int evenAndOddsNumbers (int n){

        String numLength = Integer.toString(n); // CONVERT TO STRING
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numLength.length() ; i++) {

            int digit = n % 10;

            if (digit % 2 == 0){
                evenSum += digit;
            }else {
                oddSum += digit;
            }

            n = n / 10;

        }

        return  evenSum * oddSum;

    }

}
