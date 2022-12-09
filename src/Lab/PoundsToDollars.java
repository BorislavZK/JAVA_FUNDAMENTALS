package Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BigDecimal pound = new BigDecimal(scan.nextLine());
        BigDecimal usd = new BigDecimal(1.36);
        BigDecimal poundToUsd = pound.multiply(usd);

        System.out.printf("%.3f", poundToUsd);


    }
}
