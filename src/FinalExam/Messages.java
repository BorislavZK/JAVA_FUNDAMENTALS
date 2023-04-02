package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, User> statistics = new LinkedHashMap<>();


        String command = scanner.nextLine();
        while (!command.equals("Statistics")) {
            String[] com = command.split("=");
            switch (com[0]) {
                case "Add":
                    String name = com[1];
                    int sent = Integer.parseInt(com[2]);
                    int received = Integer.parseInt(com[3]);
                    User user = new User(sent, received);
                    statistics.putIfAbsent(name, user);
                    break;
                case "Message":
                    String sender = com[1];
                    String receiver = com[2];
                    if (statistics.containsKey(sender) && statistics.containsKey(receiver)) {
                        statistics.get(sender).setSent(statistics.get(sender).sent + 1);
                        if (statistics.get(sender).sent + statistics.get(sender).received >= capacity) {
                            System.out.println(sender + " reached the capacity!");
                            statistics.remove(sender);
                        }
                        statistics.get(receiver).setReceived(statistics.get(receiver).received + 1);
                        if (statistics.get(receiver).sent + statistics.get(receiver).received >= capacity) {
                            System.out.println(receiver + " reached the capacity!");
                            statistics.remove(receiver);
                        }
                    }
                    break;
                case "Empty":
                    String username = com[1];
                    if (username.equals("All")) {
                        statistics = new LinkedHashMap<>();
                    } else {

                        statistics.remove(username);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        int count = 0;
        System.out.println("Users count: " + statistics.size());
        Map<String, User> finalStatistics = statistics;
        statistics.forEach((k, v) -> System.out.println(k + " - " + (finalStatistics.get(k).sent + finalStatistics.get(k).received)));

    }

    static class User {
        int sent;
        int received;

        public void setSent(int sent) {
            this.sent = sent;
        }

        public void setReceived(int received) {
            this.received = received;
        }

        public User(int sent, int received) {
            this.sent = sent;
            this.received = received;
        }
    }
}