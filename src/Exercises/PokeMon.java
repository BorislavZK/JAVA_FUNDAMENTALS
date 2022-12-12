package Exercises;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int power = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        int factor = Integer.parseInt(scan.nextLine());

        int pokeCount = 0;

        int startingPower = power;

        while (power >= distance) {
            power -= distance;
            pokeCount++;

            if(power == startingPower * 0.5){
                if (factor > 0){
                    power /= factor;
                }
            }
        }

        System.out.println(power);
        System.out.println(pokeCount);
    }
}
