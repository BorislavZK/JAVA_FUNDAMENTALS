package Exercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int orders = Integer.parseInt(scan.nextLine());

        double total = 0;

        for (int i = 1; i <= orders; i++) {

            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsuleCount = Integer.parseInt(scan.nextLine());

            //FORMULA -((daysInMonth * capsulesCount) * pricePerCapsule)
            double totalPerOrder = ((days * capsuleCount) * pricePerCapsule);
            total += totalPerOrder;

            System.out.printf("The price for the coffee is: $%.2f\n", totalPerOrder);

        }

        System.out.printf("Total: $%.2f", total);

    }
}
