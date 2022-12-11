package Lab;

import java.util.Scanner;

public class SpecialNumbersRefactor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int current = 0;
        boolean flag = false;
        String condition = "";
        for (int digit = 1; digit <= n; digit++) {
            current = digit;
            while (digit > 0) {
                sum += digit % 10;
                digit = digit / 10;
            }

            digit = current;

            flag = (sum == 5) || (sum == 7) || (sum == 11);

            if (flag) {
                condition = "True";
            } else {
                condition = "False";

            }

            System.out.printf("%d -> %s\n", current, condition);
            sum = 0;

        }

    }
}


