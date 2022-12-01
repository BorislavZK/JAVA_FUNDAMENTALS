package Exercises;

import java.util.Scanner;

public class VendingMachine_Bobi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double sumCoins = 0;
        int total = 0;

        String input1 = "";

        while (true) {
            input1 = scan.nextLine();
            if (input1.equals("Start")) {
                break;
            }
            double coin = Double.parseDouble(input1);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                sumCoins += coin;
            }else {
                System.out.println("Cannot accept " + coin);
            }

        }

        double price = 0;
        String input2 = "";
        boolean flag = false;

        while (true){
            input2 = scan.nextLine();
            switch (input2.toLowerCase()) {
                case "nuts":
                    price = 2;
                    flag = true;
                    break;
                case "water":
                    price = 0.7;
                    flag = true;
                    break;
                case "crisps":
                    price = 1.5;
                    flag = true;
                    break;
                case "soda":
                    price = 0.8;
                    flag = true;
                    break;
                case "coke":
                    price = 1;
                    flag = true;
                    break;
            }
        }
    }
}
