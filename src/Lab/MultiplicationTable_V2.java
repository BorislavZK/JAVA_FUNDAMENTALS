package Lab;

import java.util.Scanner;

public class MultiplicationTable_V2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());


        if (n > 10) {
            System.out.printf("%d X %d = %d", num, n, num * n);
        } else {

            for (int i = n; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", num, i, num * i);
            }

        }

    }
}
