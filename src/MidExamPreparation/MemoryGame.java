package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MemoryGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] inputArr = scan.nextLine().split(" ");
        List<String> numbers = new ArrayList<>(Arrays.asList(inputArr));

        String input = scan.nextLine();

        int numberOfMoves = 0;


        while (!input.equals("end")) {

            int firstIndex = Integer.parseInt((input.split("\\s+")[0]));
            int secondIndex = Integer.parseInt((input.split("\\s+")[1]));

            numberOfMoves++;

            if (firstIndex >= 0 && secondIndex >= 0 && firstIndex < numbers.size() && secondIndex < numbers.size() && firstIndex != secondIndex) {
                    String firstChar = numbers.get(firstIndex);
                    String secondChar = numbers.get(secondIndex);

                if (firstChar.equals(secondChar)) {

                    System.out.printf("Congrats! You have found matching elements - %s!%n", firstChar);

                    numbers.remove(firstChar);
                    numbers.remove(secondChar);


                    if (numbers.size() == 0) {
                        System.out.printf("You have won in %d turns!%n", numberOfMoves);
                        return;
                    }

                } else {
                    System.out.println("Try again!");
                }


            } else {
                int middleIndex = numbers.size() / 2;
                String elementToAdd = "-" + numberOfMoves + "a";
                numbers.add(middleIndex, elementToAdd);
                numbers.add(middleIndex, elementToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");

            }


            input = scan.nextLine();
        }

        System.out.println("Sorry you lose :(");

        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
}
