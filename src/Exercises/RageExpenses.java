package Exercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());


        double headsetLost = lostGames / 2;
        double mouseLost = lostGames / 3;
        double keyboardLost = lostGames / 6;
        double displayLost = lostGames / 12;


        double totalPrice = headsetPrice * headsetLost + mousePrice * mouseLost
                + keyboardPrice * keyboardLost + displayPrice * displayLost;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);

    }
}
