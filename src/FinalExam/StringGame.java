package FinalExam;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();


        String commands = scan.nextLine();

        while (!commands.equals("Done")) {


            if (commands.contains("Change")) { // OK
                //Change {char} {replacement}"
                String symbolToReplace = commands.split(" ")[1];
                String replacement = commands.split(" ")[2];

                input = input.replace(symbolToReplace, replacement);

                System.out.println(input);


            } else if (commands.contains("Includes")) {
                //"Includes {substring}"
                String stringToCheck = commands.split(" ")[1];

                if (input.contains(stringToCheck)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (commands.contains("End")) {
                //"End {substring}"
                String stringToCheck = commands.split(" ")[1];
                int checkIndex = input.length() - stringToCheck.length(); // -1

                String substringToCheck = input.substring(checkIndex);

                if (stringToCheck.equals(substringToCheck)) {
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }

            } else if (commands.contains("Uppercase")) {
                //"Uppercase"
                input = input.toUpperCase();

                System.out.println(input);

            } else if (commands.contains("FindIndex")) {
                //"FindIndex {char}"

                String s = commands.split(" ")[1];
                char c = s.charAt(0);

                int indexOfChar = input.indexOf(c);

                System.out.println(indexOfChar);


            } else if (commands.contains("Cut")) {
                //"Cut {startIndex} {count}"
                int startIndex = Integer.parseInt(commands.split(" ")[1]);
                int count = Integer.parseInt(commands.split(" ")[2]);
                int endIndex = startIndex + count;

                input = input.substring(startIndex, endIndex);

                System.out.println(input);

            }

            commands = scan.nextLine();
        }

    }
}
