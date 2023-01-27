package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numbers = scan.nextLine();
        List<Integer> numList = new ArrayList<>();
        for (String s : numbers.split(" ")) {
            numList.add(Integer.valueOf(s));
        }


        String input = scan.nextLine();

        while (!input.equals("end")) {

            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String command = commandLine.get(0);

            int item = 0;
            int index = 0;
            String condition = "";

            switch (command) {
                case "Contains":
                    //Contains {number} – check if the list contains the number.
                    // If yes, print "Yes", otherwise, print "No such number"
                    item = Integer.parseInt(commandLine.get(1));
                    if (numList.contains(item)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    break;

                case "Print":
                    //Print even – print all the numbers that are even separated by a space
                    //Print odd – print all the numbers that are oddly separated by a space
                    condition = commandLine.get(1);

                    System.out.println();

                    for (Integer numberEvens : numList) {
                        if (condition.equals("odd")) {
                            break;
                        }
                        if (condition.equals("even") && numberEvens % 2 == 0 && numberEvens != 0) {
                            System.out.print(numberEvens + " ");
                        }

                    }
                    for (Integer numberOdds : numList) {
                        if (condition.equals("even")) {
                            break;
                        }
                        if (condition.equals("odd") && numberOdds % 2 != 0) {
                            System.out.print(numberOdds + " ");
                        }
                    }
                    break;

                case "Get":
                    //Get sum – print the sum of all the numbers
                    System.out.println();
                    int sumElements = numList.stream().mapToInt(Integer::intValue).sum();

                    System.out.println(sumElements);

                    break;

                case "Filter":
                    //Filter {condition} {number} – print all the numbers that
                    // fulfill that condition. The condition will be either '<', '>', ">=", "<="
                    System.out.println();
                    item = Integer.parseInt(commandLine.get(2));
                    condition = commandLine.get(1);

                    if (condition.equals("<")) {
                        for (Integer number : numList) {
                            if (number < item) {
                                System.out.print(number + " ");
                            }
                        }
                    } else if (condition.equals(">")) {
                        for (Integer number : numList) {
                            if (number > item) {
                                System.out.print(number + " ");
                            }
                        }

                    } else if (condition.equals(">=")) {
                        for (Integer number : numList) {
                            if (number >= item) {
                                System.out.print(number + " ");
                            }
                        }

                    } else if (condition.equals("<=")) {
                        for (Integer number : numList) {
                            if (number <= item) {
                                System.out.print(number + " ");
                            }
                        }

                    }

                    break;


            }

            input = scan.nextLine();

        }
    }
}

