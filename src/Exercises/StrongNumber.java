package Exercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());
        int startNum = input;
        int sumFact = 0;

        while (input > 0 ){
            int lastDigit = input % 10;

            int fact = 1;

            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;
            }

            sumFact += fact;

            input = input / 10;

        }

        if (sumFact == startNum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }


    }
}
