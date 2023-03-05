package ClassesAndObjects.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] line = scan.nextLine().split(" ");
            Person person = new Person(line[0], Integer.parseInt(line[1]));
            personList.add(person);

        }

        for (Person person : personList) {
            if (person.getAge() > 30){
                System.out.println(person);
            }

        }


    }

}




