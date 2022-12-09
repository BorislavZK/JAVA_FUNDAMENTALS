package Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       int n = Integer.parseInt(scan.nextLine());

        BigDecimal total = new BigDecimal(0);


        for (int i = 1; i <= n ; i++) {

            //a = a.add(b);

            BigDecimal currentNum = new BigDecimal(scan.nextLine());

            total = currentNum.add(total);


        }

        System.out.println(total);

    }
}
