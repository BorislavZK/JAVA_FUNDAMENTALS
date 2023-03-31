package FinalExamPrep01;

import java.util.*;

public class Piirates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = "Tortuga||345000||1250";
        //scan.nextLine();

        Map<String, List<Integer>> citiesMap = new LinkedHashMap<>();

        while (!input.equals("Sail")) {
            //Tortuga||345000||1250

            String town = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);

            citiesMap.putIfAbsent(town, new ArrayList<>());
            citiesMap.get(town).add(population);
            citiesMap.get(town).add(gold);

            if (citiesMap.containsKey(town)) {
                int currentPopulation = citiesMap.get(town).get(0) + population;
                citiesMap.get(town).set(0, currentPopulation);
            }

            input = scan.nextLine();

        }


        String commands = scan.nextLine();


        while (!commands.equals("End")) {

            if (commands.contains("Plunder")) {
                //Plunder=>{town}=>{people}=>{gold}"

            } else if (commands.contains("Prosper"))
                //Prosper=>{town}=>{gold}"




                commands = scan.nextLine();
        }
    }
}
