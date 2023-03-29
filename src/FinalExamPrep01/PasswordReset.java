package FinalExamPrep01;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String command = scan.nextLine();

        while (!command.equals("Done")) {

            if (command.contains("TakeOdd")) {
                //TakeOdd
                String oddSymbols = "";
                for (int i = 1; i < input.length(); i++) {
                    if (i % 2 != 0) {
                        oddSymbols += input.charAt(i);
                    }
                }
                input = oddSymbols;
                System.out.println(input);

            } else if (command.contains("Cut")) {
                //Cut {index} {length}
                int index = Integer.parseInt(command.split(" ")[1]);
                int length = Integer.parseInt(command.split(" ")[2]);

                StringBuilder sb = new StringBuilder(input.toString());
                sb.delete(index, index + length);
                input = sb.toString();
                System.out.println(input);


            } else if (command.contains("Substitute")) {
                //Substitute {substring} {substitute}
                String wordToReplace = command.split(" ")[1];
                String substitute = command.split(" ")[2];
                if (input.contains(wordToReplace)) {
                    input = input.replace(wordToReplace, substitute);
                    System.out.println(input);
                } else {
                    System.out.println("Nothing to replace!");
                }

            }

            command = scan.nextLine();
        }

        System.out.println("Your password is: " + input);

    }
}
