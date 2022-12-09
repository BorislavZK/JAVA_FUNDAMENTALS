package Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int meters = Integer.parseInt(scan.nextLine());

        double mToKm = meters / 1000.0;

        System.out.printf("%.2f", mToKm);


    }
}
