package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scan.nextLine());
        int[] bugPosition = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] field = new int[fieldSize];

        for (int bugPositions : bugPosition) {
            int index = bugPosition[0];
            if (index >= 0 && index < field.length) {
                field[index] = 1;
            }
        }
        String line = scan.nextLine();

        while (!line.equals("end")) {
            String[] data = line.split(" ");
            int index = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyLength = Integer.parseInt(data[2]);

            if (index < 0 || index >= field.length || field[index] != 1) {
                line = scan.nextLine();
                continue;
            }
            field[index] = 0;
            switch (direction) {
                case "right":
                    index += flyLength;
                    while (index < fieldSize && field[index] == 1) {
                        index += flyLength;
                    }
                    if (index < fieldSize) {
                        field[index] = 1;
                    }
                    break;

                case "left":
                    index -= flyLength;
                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }
                    break;

            }

            line = scan.nextLine();
        }
        Arrays.stream(field).forEach(e -> System.out.print(e + " "));

    }

}
