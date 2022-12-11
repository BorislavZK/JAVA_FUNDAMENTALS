package Exercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String biggestKeg = "";

        for (int i = 1; i <= n ; i++) {

            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double kegVolume = Math.PI*Math.pow(radius, 2) * height;



            if(kegVolume > maxVolume){
                maxVolume = kegVolume;
                biggestKeg = model;

            }

        }

        System.out.println(biggestKeg);


    }
}
