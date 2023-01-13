package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.####");

        double num = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        double result2 = mathPower(num, power);

        System.out.println(df.format(result2));




    }

    public static double mathPower(double num, int power){
        double result = 1;

        for (int i = 1; i <= power ; i++) {
            result *= num;

        }

        return result;



    }
}
