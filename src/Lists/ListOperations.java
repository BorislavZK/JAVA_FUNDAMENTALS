package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        String line = scan.nextLine();

        while (!line.equals("End")) {

            String[] data = line.split("\\s+");
            String command = data[0];
            Integer element = null;
            Integer index = null;

            switch (command) {
                case "Add":
                    element = Integer.parseInt(data[1]);
                    numbers.add(element);
                    break;

                case "Insert":
                    element = Integer.parseInt(data[1]);
                    index = Integer.parseInt(data[2]);
                    break;

                case "Remove":
                    index = Integer.parseInt(data[1]);
                    numbers.remove(index);
                    break;

                case "Shift":
                    String direction = data[1];
                    int count = Integer.parseInt(data[2]);

                    if (direction.equals("left")) {
                        for (int i = 1; i <= count; i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }

                    } else {

                        for (int i = 1; i <= count; i++) {
                            int temp

                        }
                    }


                    break;
            }


            line = scan.nextLine();
        }
    }
}
