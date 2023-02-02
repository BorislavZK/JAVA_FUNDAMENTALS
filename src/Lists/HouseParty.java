package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> guests = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {

            String line = scan.nextLine();
            String[] data = line.split("\\s+");
            String name = data[0];

            if (!line.contains("not")) {
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    guests.add(name);
                }
            } else {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            }

        }

        guests.forEach(System.out::println);

    }
}
