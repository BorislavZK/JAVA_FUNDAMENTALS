package MidExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String inputPrice = scan.nextLine();
        double totalPrice = 0;
        double totalPriceWithVAT = 0;
        double vat = 0;
        boolean ifSpecial = false;

        while (!inputPrice.equals("special") && !inputPrice.equals("regular")) {

            double price = Double.parseDouble(inputPrice);

            if (price < 0) {
                System.out.println("Invalid price!");
                inputPrice = scan.nextLine();
                continue;
            }

            totalPrice += price;

            inputPrice = scan.nextLine();

            if (inputPrice.equals("special")) {
                ifSpecial = true;
            }
        }

        vat = totalPrice * 0.2;
        totalPriceWithVAT = totalPrice + vat;

        if (totalPriceWithVAT == 0) {
            System.out.println("Invalid order!");
        } else {
            if (ifSpecial) {
                totalPriceWithVAT = totalPriceWithVAT * 0.9;
            }

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", vat);
            System.out.printf("-----------%n");
            System.out.printf("Total price: %.2f$", totalPriceWithVAT);


        }

    }
}
