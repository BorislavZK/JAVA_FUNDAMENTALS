package Lab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        int sum = 1;

        for (int i = 0; i <= n - 1; i++) {
            System.out.println(2 * i + 1);
            sum += 2 * i + 1;
        }
        System.out.printf("Sum: %d%n\n", sum - 1);

    }
}
