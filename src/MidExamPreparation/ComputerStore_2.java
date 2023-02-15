package MidExamPreparation;

import java.util.Scanner;

public class ComputerStore_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double priceNoVAT = 0;
        double totalPriceNoVAT = 0;

        while (!input.equals("special") && !input.equals("regular")) {

            priceNoVAT = Double.parseDouble(input);

            if (priceNoVAT < 0) {
                System.out.println("Invalid price!");
                input = scan.nextLine();
                continue;
            }

            totalPriceNoVAT += priceNoVAT;

            input = scan.nextLine();

        }

        if (totalPriceNoVAT == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPriceNoVAT);
            System.out.printf("Taxes: %.2f$%n", totalPriceNoVAT * 0.2);
            System.out.println("-----------");
            if (input.equals("special")) {
                System.out.printf("Total price: %.2f$", (totalPriceNoVAT * 1.2) * 0.9);
            } else {
                System.out.printf("Total price: %.2f$", totalPriceNoVAT * 1.2);
            }

        }
    }
}
