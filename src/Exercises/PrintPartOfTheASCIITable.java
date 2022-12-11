package Exercises;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end ; i++) {

            char chr = (char)i;

            System.out.printf("%c ", chr);

        }
    }
}
