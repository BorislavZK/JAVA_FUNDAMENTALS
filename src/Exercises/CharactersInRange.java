package Exercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        char input1 = scan.nextLine().charAt(0);
        char input2 = scan.nextLine().charAt(0);

        characterCheckAndPrint(input1, input2);


    }


    private static void characterCheckAndPrint(char first, char second) {
        char temp = 0;

        if (first > second) {
            temp = first;
            first = second;
            second = temp;
        }

        for (int i = first + 1; i <= second - 1; i++) {
            System.out.print((char)i + " ");

        }

    }
}
