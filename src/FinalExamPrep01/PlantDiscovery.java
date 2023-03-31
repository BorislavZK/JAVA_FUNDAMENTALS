package FinalExamPrep01;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        //"{plant}<->{rarity}".

        Map<String, List<Integer>> plantsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String plant = input.split("<->")[0]; // key
            int rarity = Integer.parseInt(input.split("<->")[1]); // value 0 position


            plantsMap.putIfAbsent(plant, new ArrayList<>());
            plantsMap.get(plant).add(rarity); // 0 index

            if (plantsMap.containsKey(plant)) {
                plantsMap.get(plant).set(0, rarity); // Ako sushtestvuva da se prezapishe.
            }

        }
            // SECOND PART //

        String command = scan.nextLine();


        while (!command.equals("Exhibition")) {

            String plant = command.split(" ")[1];

            if (plantsMap.containsKey(plant)) {

                if (command.contains("Rate")) {
                    //Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)
                    int rating = Integer.parseInt(command.split(" - ")[1]);
                    plantsMap.get(plant).add(rating);


                } else if (command.contains("Update")) {
                    //"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one

                    int rarity = Integer.parseInt(command.split(" - ")[1]);

                    plantsMap.get(plant).set(0, rarity);


                } else if (command.contains("Reset")) {
                    // //"Reset: {plant}" – remove all the ratings of the given plant

                    List<Integer> sublist = plantsMap.get(plant).subList(1, plantsMap.get(plant).size());
                    plantsMap.get(plant).remove(sublist);

                }

            } else {
                System.out.println("error");
            }



            List<Double> avgList = new ArrayList<>();

            for (Map.Entry<String, List<Integer>> entry : plantsMap.entrySet()) {

                int counter = 0;
                int forIndex = entry.getValue().size();
                double avg = 0;
                for (int i = 1; i < forIndex; i++) {
                    counter ++;
                    avg += entry.getValue().get(i);
                }
                avg /= counter;
                avgList.add(avg);
            }


            command = scan.nextLine();
        }


        System.out.println("Plants for the exhibition:");




    }
}
