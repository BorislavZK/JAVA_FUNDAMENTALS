package AssociativeArrays;

import java.util.*;

public class Orders03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, List<Double>> productsMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String[] data = input.split(" ");
            String product = data[0];
            Double price = Double.parseDouble(data[1]);
            Double quantity = Double.parseDouble(data[2]);


            if (!productsMap.containsKey(product)) {
                productsMap.put(product, new ArrayList<>());
                productsMap.get(product).add(price);
                productsMap.get(product).add(quantity);
            } else {
                productsMap.get(product).set(0, price);
                quantity = productsMap.get(product).get(1) + quantity;
                productsMap.get(product).set(1, quantity);
            }


            input = scan.nextLine();
        }

        productsMap.forEach((pr, quan) -> System.out.printf("%s -> %.2f\n", pr, quan.get(0) * quan.get(1)));


    }
}
