package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine().split(","))
                .collect(Collectors.toList());


        String input = scan.nextLine();


        while (!input.equals("Craft!")) {

            String command = input.split("\\s+")[0];
            String item = input.split("\\s+")[2];

            if (command.equals("Combine")) {
                item = "";
                String temp = input.split("\\s+")[3];
                String item1 = temp.split(":")[0];
                String item2 = temp.split(":")[1];

            } else {

                switch (command) {

                    case "Collect":
                        boolean isCollectValid = true;
                        for (String s : items) {
                            if (item.equals(s)) {
                                isCollectValid = false;
                                break;
                            }
                        }
                        if (isCollectValid) {
                            items.add(item);
                        }
                        break;

                    case "Drop":
                        break;
                    case "Renew":
                        break;

                }

            }

            command = scan.nextLine();
        }
    }
}
