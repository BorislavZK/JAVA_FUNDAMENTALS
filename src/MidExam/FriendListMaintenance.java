package MidExam;

import java.util.Scanner;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(", ");
        String input = scan.nextLine();

        int blacklistCounter = 0;
        int lostCounter = 0;

        while(!input.equals("Report")){

            String[] values = input.split(" ");

            switch (values[0]){
                case "Blacklist":
                    boolean noName = true;
                    for (int i = 0; i < names.length; i++) {
                        if (values[1].equals(names[i])){
                            names[i] = "Blacklisted";
                            blacklistCounter ++;
                            noName = false;
                            System.out.printf("%s was blacklisted.%n", values[1]);
                        }
                    }
                    if (noName){
                        System.out.printf("%s was not found.%n", values[1]);
                    }
                    break;

                case "Error":
                    int index = Integer.parseInt(values[1]);
                    if (index >= 0 && index < names.length && !names[index].equals("Blacklisted")
                            && !names[index].equals("Lost")){ // VALID INDEX
                        String currentName = names[index];
                        System.out.printf("%s was lost due to an error.%n", currentName );
                        names[index] = "Lost";
                        lostCounter ++;
                    }
                    break;

                case "Change":
                    index = Integer.parseInt(values[1]);
                    if (index >= 0 && index < names.length){
                        String currentName = names[index];
                        names[index] = values[2];
                        System.out.printf("%s changed his username to %s.%n", currentName, values[2]);
                    }

                    break;
            }


            input = scan.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n", blacklistCounter);
        System.out.printf("Lost names: %d%n", lostCounter);

        for (String name : names) {
            System.out.print(name + " ");

        }
    }
}
