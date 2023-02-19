package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChatLogger2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> chat = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String command = data[0];
            String message = data[1];
            switch (command) {
                case "Chat":
                    chat.add(message);
                    break;
                case "Delete":
                    chat.remove(message);
                    break;
                case "Edit":
                    if (chat.contains(message)) {
                        chat.set(chat.indexOf(message), data[2]);
                    }
                    break;
                case "Pin":
                    if (chat.contains(message)) {
                        chat.add(message);
                        chat.remove(message);
                    }
                    break;
                case "Spam":
                    chat.addAll(Arrays.asList(data).subList(1, data.length));
                    break;
            }
            input = scan.nextLine();
        }
        for (String s : chat) {
            System.out.println(s);

        }
    }
}

