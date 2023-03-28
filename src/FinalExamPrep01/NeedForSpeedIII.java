package FinalExamPrep01;
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

                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distance, fuelNeeded);

                    //You like driving new cars only, so if a car's mileage reaches
                    // 100 000 km, remove it from the collection(s) and print: "Time to sell the {car}!"

                    if (carsMap.get(car).get(0) >= 100000){
                        System.out.printf("Time to sell the %s!\n", car);
                        carsMap.remove(car);
                    }

                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

            } else if (commands.contains("Refuel")) {
                //Refuel : {car} : {fuel}
                String car = commands.split(" : ")[1];
                int fuelToRefill = Integer.parseInt(commands.split(" : ")[2]);

                if (carsMap.get(car).get(1) < 75) {
                    int emptySpace = 75 - carsMap.get(car).get(1);
                    int neededFuel = 0;

                    if (emptySpace > fuelToRefill) {
                        neededFuel = fuelToRefill;
                    } else {
                        neededFuel = emptySpace;
                    }
                    carsMap.get(car).set(1, carsMap.get(car).get(1) + neededFuel);

                    System.out.printf("%s refueled with %d liters\n", car, neededFuel);
                }
            } else if (commands.contains("Revert")) {
                //Revert : {car} : {kilometers}

                String car = commands.split(" : ")[1];
                int milesToRevert = Integer.parseInt(commands.split(" : ")[2]);
                int miles = carsMap.get(car).get(0) - milesToRevert;
                if (miles < 10000) {
                    miles = 10000;
                    carsMap.get(car).set(0, miles);
                } else {
                    carsMap.get(car).set(0, miles);
                    System.out.printf("%s mileage decreased by %d kilometers\n", car, milesToRevert);
                }


            }

            commands = scan.nextLine();
        }


        for (Map.Entry<String, List<Integer>> entry : carsMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",
                    entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));

        }


    }
}
