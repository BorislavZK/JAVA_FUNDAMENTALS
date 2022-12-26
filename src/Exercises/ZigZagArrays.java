package Exercises;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] first = new String[n];
        String[] second = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] inputArr = scan.nextLine().split(" ");

            if (i % 2 != 0) {
                first[i - 1] = inputArr[0];
                second[i - 1] = inputArr[1];
            } else {
                first[i - 1] = inputArr[1];
                second[i - 1] = inputArr[0];
            }

        }

        System.out.println(String.join(" ", first));
        System.out.println(String.join(" ", second));
    }
}
