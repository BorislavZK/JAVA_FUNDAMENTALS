package TextProcessing;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        int multiplier = Integer.parseInt(scan.nextLine());

        int remainder = 0;

        for (int i = number.length() - 1; i >= 0; i--) {

            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));

            int product = digit * multiplier + remainder;

            if (i == 0) {
                sb.insert(0, product);
            } else {

                int digitToAdd = product % 10;
                remainder = product / 10;

                sb.insert(0, digitToAdd);
            }

        }

        while (sb.charAt(0) == '0' && sb.length() > 1){

            sb.deleteCharAt(0);
        }

        System.out.println(sb);
    }
}
