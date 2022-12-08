package MoreExercises;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        int lastDigit = input % 10;


        if (lastDigit == 1) {
            System.out.println("one");
        } else if (lastDigit == 2) {
            System.out.println("two");
        } else if (lastDigit == 3) {
            System.out.println("three");
        } else if (lastDigit == 4) {
            System.out.println("four");
        } else if (lastDigit == 5) {
            System.out.println("five");
        } else if (lastDigit == 6) {
            System.out.println("six");
        } else if (lastDigit == 7) {
            System.out.println("seven");
        } else if (lastDigit == 8) {
            System.out.println("eight");
        } else if (lastDigit == 9) {
            System.out.println("nine");
        }else if (lastDigit == 0 ){
            System.out.println("zero");
        }
    }
}
