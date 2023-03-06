package ClassesAndObjects.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        List<Persons> personsList = new ArrayList<>();

        while(!line.equals("End")){


            String[] data = line.split(" ");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);

            Persons person = new Persons(name, id, age);

            personsList.add(person);


            line = scan.nextLine();

        }

        personsList.sort(Comparator.comparingInt(Persons::getAge));


        for (Persons persons : personsList) {
            System.out.println(persons);

        }

    }
}
