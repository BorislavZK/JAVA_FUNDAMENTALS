package Exercises;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = start; i <= end ; i++) {
            sum += i;

            System.out.print(i +" ");

        }
        System.out.println();
        System.out.printf("Sum: %d\n", sum);

    }
}
