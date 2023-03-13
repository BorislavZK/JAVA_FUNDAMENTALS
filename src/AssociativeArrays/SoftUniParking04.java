package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, String> namesAndNumbers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] line = scan.nextLine().split("\\s+");
            String command = line[0];
            String name = line[1];

            if (command.equals("register")) { // register command
                String number = line[2];

                if (!namesAndNumbers.containsKey(name)) {
                    namesAndNumbers.put(name, number);
                    System.out.printf("%s registered %s successfully\n", name, number);
                } else {
                    // the number is already exist ERR MSG
                    String existingPlate = namesAndNumbers.get(name);
                    System.out.printf("ERROR: already registered with plate number %s\n", existingPlate);
                }

            } else {  // unregister command

                if (!namesAndNumbers.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found\n", name);
                } else {
                    namesAndNumbers.remove(name);
                    System.out.printf("%s unregistered successfully\n", name);
                }

            }

        }
        scan.close();
        //PRINT
        //•	"{username} => {licensePlateNumber}"
        namesAndNumbers.forEach((name, plate) -> System.out.printf("%s => %s\n", name, plate));

    }
}
