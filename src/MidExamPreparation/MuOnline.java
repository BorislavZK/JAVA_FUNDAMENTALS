package MidExamPreparation;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int health = 100;
        int bitcoin = 0;
        int roomCounter = 0;
        boolean isDead = false;

        String[] rooms = scan.nextLine().split("\\|");
        int roomIndex = 0;
        while (health > 0 && roomIndex < rooms.length) {


            String[] currentRoom = rooms[roomIndex].split("\\s+");
            String command = currentRoom[0];
            String monster = "";
            int number = Integer.parseInt(currentRoom[1]);

            switch (command) {
                case "potion":
                    roomCounter++;
                    int diffHealth = 100 - health;
                    health += number;

                    if (health > 100) {
                        number = diffHealth;
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", number); //ZA POSLE
                    System.out.printf("Current health: %s hp.%n", health);
                    break;

                case "chest":
                    roomCounter++;
                    bitcoin += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;

                default:
                    roomCounter++;
                    monster = command;
                    health -= number;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", monster);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", monster);
                        isDead = true;
                    }
                    break;
            }

            roomIndex++;
        }

        if (isDead) {
            System.out.printf("Best room: %d", roomCounter);
        } else {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoin);
            System.out.printf("Health: %d", health);
        }
    }
}
