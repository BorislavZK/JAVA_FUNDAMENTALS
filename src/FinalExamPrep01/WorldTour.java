package FinalExamPrep01;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stops = scan.nextLine();
        String command = scan.nextLine();

        while (!command.equals("Travel")) {

            if (command.contains("Add")) {
                //Add Stop:{index}:{string}
                int index = Integer.parseInt(command.split(":")[1]);
                String stringToAdd = command.split(":")[2];

                if (index >= 0 && index <= stops.length() - 1) {
                    StringBuilder sb = new StringBuilder(stops);
                    sb.insert(index, stringToAdd);
                    stops = sb.toString();
                    System.out.println(stops);

                } else {
                    System.out.println(stops);
                }

            } else if (command.contains("Remove")) {
                //Remove Stop:{start_index}:{end_index}
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int stopIndex = Integer.parseInt(command.split(":")[2]);

                if (startIndex >= 0 && startIndex <= stops.length() - 1 && stopIndex >= 0 && stopIndex <= stops.length() - 1) {
                    StringBuilder sb = new StringBuilder(stops);
                    sb.replace(startIndex, stopIndex + 1, "");
                    stops = sb.toString();
                    System.out.println(stops);
                }else {
                    System.out.println(stops);
                }


            } else if (command.contains("Switch")) {
                //Switch:{old_string}:{new_string}"
                String oldString = command.split(":")[1];
                String newString = command.split(":")[2];

                if (stops.contains(oldString)) {
                    stops = stops.replace(oldString, newString);
                    System.out.println(stops);
                }else{
                    System.out.println(stops);
                }


            }
            command = scan.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stops);
    }
}
