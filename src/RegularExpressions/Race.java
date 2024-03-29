package RegularExpressions;

import java.util.*;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String racers = scan.nextLine();

        List<String> racersList = Arrays.stream(racers.split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> racersMap = new LinkedHashMap<>();

        String infoCommand = scan.nextLine();

        while (!infoCommand.equals("end of race")) {

            String currentName = "";
            int currentDistance = 0;

            for (int i = 0; i < infoCommand.length(); i++) {

                char currentChar = infoCommand.charAt(i);

                if (Character.isLetter(currentChar)) { // Име!
                    currentName += currentChar;
                }

                if (Character.isDigit(currentChar)) { // Дистанця!
                    int currentNumber = Integer.parseInt(String.valueOf(currentChar));
                    currentDistance += currentNumber;
                }

            }

            if (racersList.contains(currentName)) { // Проверка дали присъстват в оригиналния списък!

                if (!racersMap.containsKey(currentName)) {
                    racersMap.put(currentName, currentDistance);
                } else {
                    //int newMapValue = racersMap.get(currentName) + currentDistance;
                    racersMap.put(currentName, racersMap.get(currentName) + currentDistance);
                }

            }

            infoCommand = scan.nextLine();
        }

        List<String> topThree = racersMap.entrySet()
                .stream()
                .sorted((v1, v2) -> Integer.compare(v2.getValue(), v1.getValue()))
                .limit(3).map(Map.Entry::getKey)
                .collect(Collectors.toList());


        System.out.println("1st place: " + topThree.get(0));
        System.out.println("2nd place: " + topThree.get(1));
        System.out.println("3rd place: " + topThree.get(2));
    }
}
