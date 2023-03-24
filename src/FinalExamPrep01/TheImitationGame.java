package FinalExamPrep01;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();

        String command = scan.nextLine();

        while (!command.equals("Decode")) {


            if (command.contains("ChangeAll")) {  //ChangeAll command //ChangeAll|z|l


            } else if (command.contains("Insert")) {  //Insert|2|o


            } else if (command.contains("Move")) {  //Move|3  //Move {number of letters}": //Moves the first n letters to the back of the string
                int index = Integer.parseInt(command.split("\\|")[1]);
                String firstLetters = message.substring(0, index);
                String remainingLetters = message.substring(index);
                message = remainingLetters + firstLetters;



                System.out.println(message);

            }

            command = scan.nextLine();
        }
    }
}
