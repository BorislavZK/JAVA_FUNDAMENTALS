package TESTS;

import java.util.Scanner;

public class TouristShopNIKI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        String product = scan.nextLine();

        int counterProducts = 0;
        double sum = 0;
        boolean isEnoughMoney = true;

        while (!product.equals("Stop")) {
            double productPrice = Double.parseDouble(scan.nextLine());
            counterProducts++;
            if (counterProducts % 3 == 0) {
                productPrice *= 0.5;
            }
            if (productPrice > budget) {
                double spendMoney = Math.abs(productPrice - budget);
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", spendMoney);
                isEnoughMoney = false;
                break;
            }else{
                sum += productPrice;
                budget -= productPrice;
            }
            product = scan.nextLine();
        }


        if(isEnoughMoney){
        System.out.printf("You bought %d products for %.2f leva.", counterProducts, Math.abs(sum));

        }
    }
}
