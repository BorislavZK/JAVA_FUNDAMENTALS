package FinalExamPrep01;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        //"{plant}<->{rarity}".

        Map<String, List<Double>> plantsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String plant = input.split("<->")[0]; // key
            double rarity = Double.parseDouble(input.split("<->")[1]); // value 0 position


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
                    double rating = Double.parseDouble(command.split(" - ")[1]);
                    plantsMap.get(plant).add(rating);


                } else if (command.contains("Update")) {
                    //"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one

                    double rarity = Double.parseDouble(command.split(" - ")[1]);

                    plantsMap.get(plant).set(0, rarity);


                } else if (command.contains("Reset")) {
                    // //"Reset: {plant}" – remove all the ratings of the given plant

                    List<Double> sublist = plantsMap.get(plant).subList(1, plantsMap.get(plant).size());
                    plantsMap.get(plant).remove(sublist);

                }

            } else {
                System.out.println("error");
            }


            //List<Double> avgList = new ArrayList<>();

            for (Map.Entry<String, List<Double>> entry : plantsMap.entrySet()) {

                int counter = 0;
                int forIndex = entry.getValue().size();
                double avg = 0;

                for (int i = 1; i < forIndex; i++) {
                    counter++;
                    avg += entry.getValue().get(i);
                }



                avg /= counter;

                if(forIndex == 1){
                    avg = entry.getValue().get(1);
                }

                entry.getValue().add(avg);



            }


            command = scan.nextLine();
        }


        System.out.println("Plants for the exhibition:");


        for (Map.Entry<String, List<Double>> entry : plantsMap.entrySet()) {
            //- Arnoldii; Rarity: 4; Rating: 0.00

            if(Double.isNaN(entry.getValue().get(entry.getValue().size() - 1))){
                double zero = 0.0;
                entry.getValue().set(entry.getValue().size()-1, zero);

            }
            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(entry.getValue().size() - 1));
        }


    }
}
