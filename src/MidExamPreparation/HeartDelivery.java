package MidExamPreparation;

import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("@");
        int[] houses = new int[input.length];

        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(input[i]);
        }

        int lastPosition = 0;
        int counterNotSuccessful = 0;
        int currentIndex = 0;
        int valueOfIndex = 0;

        String commandsLine = scan.nextLine();
        while (!commandsLine.equals("Love!")) {

            String[] commands = commandsLine.split("\\s+");

            int index = Integer.parseInt(commands[1]); // vzima indexa

            currentIndex += index; // tekushtata poziciq plus indeksa

            if (currentIndex >= 0 && currentIndex < houses.length) {
                valueOfIndex = houses[currentIndex]; // ako e validen vzimame negovata stoinost
            } else {
                currentIndex = 0;
                valueOfIndex = houses[currentIndex]; // ako e validen vzimame negovata stoinost
            }

            if (valueOfIndex == 0) { // ako e raven na 0 - veche e praznuval
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            } else {
                valueOfIndex -= 2; // vadim 2 valentinki
                if (valueOfIndex == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
                houses[currentIndex] = valueOfIndex; // podmenqme sus novata stoinost
            }

            lastPosition = currentIndex; //!!
            commandsLine = scan.nextLine();
        }

        for (int house : houses) {
            if (house != 0) {
                counterNotSuccessful++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", lastPosition);

        if (counterNotSuccessful > 0) {
            System.out.printf("Cupid has failed %d places.", counterNotSuccessful);
        } else {
            System.out.println("Mission was successful.");
        }

    }
}
