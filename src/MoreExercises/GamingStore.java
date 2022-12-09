package MoreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        double total = 0;
        boolean flag = false;

        while (true) {
            String game = scan.nextLine();

            double currentPrice = 0;
            String currentGame = "";

            if (game.equals("Game Time")) {
                break;
            }

            if (budget <= 0) {
                return;
            } else {
                switch (game) {
                    case "OutFall 4":
                        currentPrice = 39.99;
                        currentGame = "OutFall 4";
                        break;

                    case "CS: OG":
                        currentPrice = 15.99;
                        currentGame = "CS: OG";
                        break;

                    case "Zplinter Zell":
                        currentPrice = 19.99;
                        currentGame = "Zplinter Zell";
                        break;

                    case "Honored 2":
                        currentPrice = 59.99;
                        currentGame = "Honored 2";
                        break;

                    case "RoverWatch":
                        currentPrice = 29.99;
                        currentGame = "RoverWatch";
                        break;

                    case "RoverWatch Origins Edition":
                        currentPrice = 39.99;
                        currentGame = "RoverWatch Origins Edition";
                        break;

                    default:
                        System.out.println("Not Found");
                        continue;

                }

            }


            if (budget < currentPrice) {
                System.out.println("Too Expensive");
                continue;
            } else {
                System.out.printf("Bought %s\n", currentGame);
            }

            budget -= currentPrice;
            total += currentPrice;


        }

        if (budget <= 0) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. ", total);
            System.out.printf("Remaining: $%.2f", budget);
        }


    }
}
