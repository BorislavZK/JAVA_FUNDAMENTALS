package MidExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            numbers.add(Integer.valueOf(line[i]));
        }


        String[] commands = scan.nextLine().split("\\s+");

        while (!commands[0].equals("End")) {
            int index = Integer.parseInt(commands[1]);
            int powRadVal = Integer.parseInt(commands[2]);

            switch (commands[0]) {

                case "Add":
                    if (index >= 0 && index < numbers.size()){    // MOJE BI -1
                        int addElement = numbers.get(index) + powRadVal;
                        numbers.set(index, addElement);
                    }
                        break;

                case "Shoot":
                    break;

                case "Strike":
                    break;

            }

            commands = scan.nextLine().split("\\s+");

        }

        System.out.println("bobi");
    }

    //private static boolean ifIndexValid ()
}
