package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> numList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scan.nextLine();

        while (!input.equals("end")){

            List<String> commandLine = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());

            String command = commandLine.get(0);

            int item = 0;
            int index = 0;

            switch (command){

                case "Add":
                    //Add {number}: add a number to the end of the list
                    int element = Integer.parseInt(commandLine.get(1));
                    numList.add(element);
                    break;

                case "Remove":
                    //Remove {number}: remove a number from the list
                    item = Integer.parseInt(commandLine.get(1));
                    numList.remove(Integer.valueOf(item));
                    break;

                case "RemoveAt":
                    //RemoveAt {index}: remove a number at a given index
                    index = Integer.parseInt(commandLine.get(1));
                    numList.remove(index);
                    break;

                case "Insert":
                    //Insert {number} {index}: insert a number at a given index
                    item = Integer.parseInt(commandLine.get(1));
                    index = Integer.parseInt(commandLine.get(2));
                    numList.add(index, item);
                    break;

            }
            //UPDATE
            input = scan.nextLine();
        }
            //PRINTING
        for (Integer number : numList) {
            System.out.print(number + " ");

        }

    }
}
