package Exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());

        //n1+n2-n3

        System.out.println(numberSubtraction(numbersAddition(n1,n2), n3));
    }


    private static int numbersAddition(int num1, int num2) {
        return num1 + num2;
    }

    private static int numberSubtraction(int num1, int num2) {
        return num1 - num2;

    }
}
