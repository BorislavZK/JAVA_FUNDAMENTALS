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

            if (command.equals("register")) {
                String number = line[2];

                if (!namesAndNumbers.containsKey(name)) {
                    namesAndNumbers.put(name, number);
                    System.out.printf("%s registered %s successfully", name, number);
                } else {
                    // the number is already exist ERR MSG
                    String existingPlate = namesAndNumbers.get(name);
                    System.out.printf("ERROR: already registered with plate number %s", existingPlate);

                }


            } else {

                // unregister command

            }

        }


        //PRINT
    }
}
