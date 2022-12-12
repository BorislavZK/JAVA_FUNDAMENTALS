package Exercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int source = Integer.parseInt(scan.nextLine());
        int days = 0;
        int amount = 0;

        while ( source >= 100){
            int spices = source -26;
            amount += spices;
            days ++;

            source -= 10;
        }
        System.out.println(days);

        if ( amount >= 26){
            amount -= 26;
        }

        System.out.println(amount);
    }
}
