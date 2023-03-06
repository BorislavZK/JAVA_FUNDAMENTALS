package ClassesAndObjects.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        List<Vehicles> vehiclesList = new ArrayList<>();


        while (!line.equals("End")) {
            String[] data = line.split(" ");

            String type = data[0];
            String model = data[1];
            String color = data[2];
            int hp = Integer.parseInt(data[3]);

            if (type.equals("car")) {
                type = "Car";
            } else if (type.equals("truck")) {
                type = "Truck";
            }

            Vehicles vehicle = new Vehicles(type, model, color, hp);

            vehiclesList.add(vehicle);

            line = scan.nextLine();

        }

        line = scan.nextLine();

        while (!line.equals("Close the Catalogue")) {


            for (Vehicles vehicle : vehiclesList) {
                if (vehicle.getModel().equals(line)) {
                    System.out.print(vehicle);
                }
            }

            line = scan.nextLine();

        }

        double avgCarHp = 0;
        double avgTruckHp = 0;
        int cars = 0;
        int trucks = 0;
        for (Vehicles vehicles : vehiclesList) {
            if (vehicles.getType().equals("Car")) {
                avgCarHp += vehicles.getHp();
                cars++;
            } else {
                avgTruckHp += vehicles.getHp();
                trucks++;
            }

        }

        if (trucks == 0){
            avgTruckHp = 0.0;
            trucks = 1;
        }

        if(cars == 0){
            avgCarHp = 0.0;
            cars = 1;
        }

//        Cars have average horsepower of: 413.33.
//        Trucks have average horsepower of: 250.00.

        System.out.printf("Cars have average horsepower of: %.2f.\n", avgCarHp / cars);
        System.out.printf("Trucks have average horsepower of: %.2f.", avgTruckHp / trucks);


    }
}
