package AssociativeArrays;

import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, List<String>> companyAndEmployees = new LinkedHashMap<>();

        while (!input.equals("End")) {

            String[] data = input.split("\\s+->\\s+");
            String company = data[0];
            String id = data[1];


            if (!companyAndEmployees.containsKey(company)) {
                companyAndEmployees.put(company, new ArrayList<>());
                companyAndEmployees.get(company).add(id);
            } else {
                for (int i = 0; i < companyAndEmployees.get(company).size(); i++) {
                    if (!companyAndEmployees.get(company).contains(id)) {
                        companyAndEmployees.get(company).add(id);
                    }

                }

            }

            input = scan.nextLine();
        }


        companyAndEmployees.forEach((k, v) ->

                System.out.printf("%s%n-- %s%n", k, String.join("\n-- ", v)));

    }
}
