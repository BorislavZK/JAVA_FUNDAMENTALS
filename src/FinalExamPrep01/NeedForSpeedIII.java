package FinalExamPrep01;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();

            String carModel = input.split("\\|")[0];
            int carMiles = Integer.parseInt(input.split("\\|")[1]);
            int carCurrentFuel = Integer.parseInt(input.split("\\|")[2]);

            carsMap.put(carModel, new ArrayList<>());
            carsMap.get(carModel).add(carMiles);  //POSITION 0
            carsMap.get(carModel).add(carCurrentFuel); //POSITION 1

        }

        String commands = scan.nextLine();

        while (!commands.equals("Stop")) {

            if (commands.contains("Drive")) {
                //"Drive : {car} : {distance} : {fuel}":
                String car = commands.split(" : ")[1];
                int distance = Integer.parseInt(commands.split(" : ")[2]);
                int fuelNeeded = Integer.parseInt(commands.split(" : ")[3]);

                if (carsMap.get(car).get(1) >= fuelNeeded) {
                    carsMap.get(car).set(0, carsMap.get(car).get(0) + distance);
                    carsMap.get(car).set(1, carsMap.get(car).get(1) - fuelNeeded);
                }

            } else if (commands.contains("Refuel")) {
                //Refuel : {car} : {fuel}
                String car = commands.split(" : ")[1];
                int fuelToRefill = Integer.parseInt(commands.split(" : ")[1]);

                if (carsMap.get(car).get(1) < 75) {
                    int emptySpace = 75 - carsMap.get(car).get(1);
                    int neededFuel = 0;
                    if (emptySpace > fuelToRefill) {
                        neededFuel = fuelToRefill;
                    } else {
                        neededFuel = fuelToRefill - emptySpace;
                    }
                    carsMap.get(car).set(1, carsMap.get(car).get(1) + neededFuel);
                }
            } else if (commands.contains("Revert")) {
                //Revert : {car} : {kilometers}

                String car = commands.split(" : ")[1];
                int milesToRevert = Integer.parseInt(commands.split(" : ")[2]);

                int miles = carsMap.get(car).get(0) - milesToRevert;
                carsMap.get(car).set(0, miles);


                // TODO: 27/03/2023 Print in every command!

            }
        }
    }
}
