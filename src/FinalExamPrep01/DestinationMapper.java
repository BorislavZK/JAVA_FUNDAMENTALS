package FinalExamPrep01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Matcher matcher = Pattern.compile("([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1").matcher(input);
        //([=/])[A-Z][A-Za-z]{2,}\\1


       List<String> destinationList = new ArrayList<>();

        int totalPoints = 0;

        while (matcher.find()){

            String destination = matcher.group("destination");

            destinationList.add(destination);


            totalPoints += destination.length();

        }



        String delimiter = ", ";
        String str =  String.join(delimiter, destinationList);

        System.out.println("Destinations: " + str);
        System.out.printf("Travel Points: %d\n", totalPoints);





    }
}
