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
                    if (isIndexValid(index, numbers)) {
                        int addElement = numbers.get(index) + powRadVal;
                        numbers.set(index, addElement);
                    } else {
                        System.out.println("Invalid placement!");
                    }
//                    if (index >= 0 && index < numbers.size()) {    //!!!
//                        int addElement = numbers.get(index) + powRadVal;
//                        numbers.set(index, addElement);
//                    }
                    break;

                case "Shoot":

                    if (isIndexValid(index, numbers)) {
                        int shootElement = numbers.get(index) - powRadVal;
                        if (shootElement <= 0) {
                            numbers.remove(index);
                        } else {
                            numbers.set(index, shootElement);
                        }
                    }
                    break;

                case "Strike":

                    if (isStrikeIndexValid(index, powRadVal, numbers)) {

                        for (int i = index - powRadVal; i <= index + powRadVal; i++) {
                            numbers.remove(index - powRadVal);

                        }

                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            commands = scan.nextLine().split("\\s+");

        }

        for (int i = 0; i < numbers.size() ; i++) {
            if(i < numbers.size()-1){
                System.out.print(numbers.get(i) + "|");
            }else{
                System.out.print(numbers.get(i));
            }


        }
    }

    private static boolean isIndexValid(int index, List<Integer> numbers) {
        return index >= 0 && index < numbers.size();
    }

    private static boolean isStrikeIndexValid(int index, int power, List<Integer> numbers) {
        return index - power >= 0 && index + power <= numbers.size() - 1;

    }
}


//        5 5 5 5
//        Add 0 5
//        Add 1 5
//        Add 4 5
//        Shoot 0 2
//        Shoot 1 2
//        Shoot 4 5
//        End
//
