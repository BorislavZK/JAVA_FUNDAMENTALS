package FinalExam;

import java.util.*;

public class MessagesManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = Integer.parseInt(scan.nextLine());

        String commands = scan.nextLine();
        //"Statistics"

        Map<String, List<Integer>> messagesMap = new LinkedHashMap<>();

        while (!commands.equals("Statistics")) {

            if (commands.contains("Add")) {
                //"Add={username}={sent}={received}"

                String username = commands.split("=")[1];
                int sent = Integer.parseInt(commands.split("=")[2]);
                int received = Integer.parseInt(commands.split("=")[3]);

                messagesMap.putIfAbsent(username, new ArrayList<>());
                messagesMap.get(username).add(sent);
                messagesMap.get(username).add(received);

            } else if (commands.contains("Message")) {
                //"Message={sender}={receiver}"
                String sender = commands.split("=")[1];
                String receiver = commands.split("=")[2];

                if (messagesMap.containsKey(sender) && messagesMap.containsKey(receiver)) {

                    int currentSentMessages = messagesMap.get(sender).get(0);
                    messagesMap.get(sender).set(0, currentSentMessages + 1);

                    int currentReceiverMessages = messagesMap.get(receiver).get(1);
                    messagesMap.get(receiver).set(1, currentReceiverMessages + 1);

                    int senderSentCount = messagesMap.get(sender).get(0);
                    int senderReceivedCount = messagesMap.get(sender).get(1);
                    int totalSenderMessages = senderSentCount + senderReceivedCount;

                    if (totalSenderMessages == capacity) {
                        messagesMap.remove(sender);
                        System.out.printf("%s reached the capacity!\n", sender);

                    }

                    int totalReceiverCount = messagesMap.get(receiver).get(0) + messagesMap.get(receiver).get(1);

                    if (totalReceiverCount == capacity) {
                        messagesMap.remove(receiver);
                        System.out.printf("%s reached the capacity!", sender);
                    }

                }

            } else if (commands.contains("Empty")) {
                //"Empty={username}"

                String username  = commands.split("=")[1];

                if (messagesMap.containsKey(username)){
                    messagesMap.get(username).set(0,0);
                    messagesMap.get(username).set(1,0);
                }

                if (username.equals("ALL")){

                    for (Map.Entry<String, List<Integer>> entry : messagesMap.entrySet()) {
                        entry.getValue().set(0,0);
                        entry.getValue().set(1,0);
                    }

                }

            }


            commands = scan.nextLine();

        }

        System.out.printf("Users count: %d\n", messagesMap.size());

        for (Map.Entry<String, List<Integer>> entry : messagesMap.entrySet()) {
            int sum = entry.getValue().get(0) + entry.getValue().get(1);

            System.out.printf("%s - %d\n", entry.getKey(), sum );
        }


    }
}

