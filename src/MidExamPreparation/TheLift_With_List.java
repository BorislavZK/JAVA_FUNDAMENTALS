package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift_With_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWait = Integer.parseInt(scanner.nextLine()); //15
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        //{0, 0, 0 , 0}


        for (int wagon = 0; wagon <= wagons.size() - 1; wagon++) {
            if (peopleWait > 0) {
                int currentCountPeople = wagons.get(wagon); //текущ брой на хората
                while (currentCountPeople < 4) {
                    //добавям човек във вагона ако има чакащи
                    if (peopleWait <= 0) {
                        break;
                    }
                    currentCountPeople++;
                    wagons.set(wagon, currentCountPeople);
                    peopleWait--;
                }
            }
        }

        if (peopleWait <= 0 && wagons.get(wagons.size() - 1) < 4) {
            //имаме останало място
            System.out.println("The lift has empty spots!");
        } else if (peopleWait > 0 && wagons.get(wagons.size() - 1) >= 4) {
            //нямаме повече място
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWait);
        }

        //отпечатваме вагоните
        System.out.println(wagons.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}