package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scan.nextLine());
        int[] field = new int[fieldSize];

        int[] ladyBugIndexes = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int ladyBugIndex : ladyBugIndexes) {
            if (ladyBugIndex >= 0 && ladyBugIndex <= field.length - 1) {
                field[ladyBugIndex] = 1;
            }
        }

        String command = scan.nextLine();

        while (!command.equals("end")) {

            String[] tokens = command.split(" ");
            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flightLength = Integer.parseInt(tokens[2]);


            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                field[index] = 0;

                if (direction.equals("right")) {
                    index += flightLength;

                    while (index <= field.length - 1 && field[index] == 1) {
                        index += flightLength;
                    }

                    if (index <= field.length - 1) {
                        field[index] = 1;
                    }

                } else if (direction.equals("left")) {
                    index -= flightLength;

                    while (index >= 0 && field[index] == 1) {
                        index -= flightLength;
                    }

                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }

            command = scan.nextLine();

        }

        for (int number : field) {
            System.out.print(number + " ");

        }

    }
}
