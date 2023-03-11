package AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        Map<String, Integer> sheet = new LinkedHashMap<>();

        while (true) {

            if (!sheet.containsKey(resource)) {
                sheet.put(resource, quantity);
            } else {
                sheet.put(resource, sheet.get(resource) + quantity);
            }

            resource = scan.nextLine();

            if (resource.equals("stop")){
                break;
            }
            quantity = Integer.parseInt(scan.nextLine());
        }


        sheet.forEach((res, quan) -> System.out.printf("%s -> %d\n", res, quan));

    }
}
