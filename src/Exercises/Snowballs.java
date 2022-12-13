package Exercises;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double maxValue = Double.MIN_VALUE;
        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;

        for (int i = 1; i <= n; i++) {

            int snow = Integer.parseInt(scan.nextLine());
            int time = Integer.parseInt(scan.nextLine());
            int quality = Integer.parseInt(scan.nextLine());

            //(snowballSnow / snowballTime) ^ snowballQuality


            double value = Math.pow((1.0 * snow / time), quality);
            //double value2 = Math.pow(value, quality);

            if (value > maxValue) {
                maxValue = value;
                maxSnow = snow;
                maxTime = time;
                maxQuality = quality;
            }

        }
        //"{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})

        System.out.printf("%d : %d = %.0f (%d)",maxSnow, maxTime, maxValue, maxQuality);


    }
}
