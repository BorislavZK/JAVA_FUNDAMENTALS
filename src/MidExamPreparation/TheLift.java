package MidExamPreparation;

import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scan.nextLine());

        String[] input = scan.nextLine().split("\\s+");

        int[] liftLine = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            liftLine[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < liftLine.length; i++) {
            int currentFreeSpace = 0;
            int difference = 0;

            if (liftLine[i] < 4) { // proverqvame dali ima svobodni mesta
                currentFreeSpace = 4 - liftLine[i]; // ako ima vzimame broq svobodni mesta
                peopleWaiting -= currentFreeSpace; // chakashtite hora - svobodnite mesta

                if (peopleWaiting < 0) {
                    difference = Math.abs(peopleWaiting);
                    peopleWaiting = 0;
                    liftLine[i] = 4 - difference;
                } else {
                    liftLine[i] += 4 - difference;
                }

            }

        }
        boolean isFreeSpace = false;
        for (int i = 0; i < liftLine.length; i++) {
            if (liftLine[i] != 4) {
                isFreeSpace = true;
            }
        }
        if (isFreeSpace) {
            System.out.println("The lift has empty spots!");
        } else {
            System.out.println("There isn't enough space!");
            System.out.printf("%d people in a queue!%n", peopleWaiting);
        }

        for (int i : liftLine) {

            System.out.print(i + " ");

        }

    }
}
