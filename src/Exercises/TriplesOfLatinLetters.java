package Exercises;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n - 1; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j <= n - 1; j++) {
                char secondChar = (char) ('a' + j);
                for (int k = 0; k <= n - 1; k++) {
                    char thirdChar = (char) ('a' + k);

                    String all = String.format("%c%c%c\n", firstChar, secondChar, thirdChar);
                    System.out.print(all);


                }

            }

        }
    }
}
