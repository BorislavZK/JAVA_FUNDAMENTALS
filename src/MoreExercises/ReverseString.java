package MoreExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();

        String reverse = "";


        for (int i = input.length() -1 ; i >= 0 ; i--) {

           char symbol = input.charAt(i);

            reverse += symbol;

        }

        System.out.println(reverse);
    }
}
