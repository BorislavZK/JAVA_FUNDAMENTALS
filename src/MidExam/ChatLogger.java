package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> chat = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("end")) {

            String[] values = input.split("\\s+");
            String message = values[1];

            switch (values[0]){

                case"Chat":
                    chat.add(message);
                    break;

                case"Delete":
                    chat.remove(message);
                    break;

                case"Edit":
                    if(chat.contains(message)){
                        chat.set(chat.indexOf(message), values[2]);
                    }
                    break;

                case"Pin":
                    if(chat.contains(message)){
                        chat.add(message);
                        chat.remove(message);
                    }
                    break;

                case"Spam":
                    chat.addAll(Arrays.asList(values).subList(1, values.length));
                    break;

            }

            input = scan.nextLine();
        }

        for (String s : chat) {
            System.out.println(s);

        }

    }
}
