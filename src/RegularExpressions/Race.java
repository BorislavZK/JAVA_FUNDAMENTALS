package RegularExpressions;

import java.util.*;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String racers = scan.nextLine();

        List<String> racersList = Arrays.stream(racers.split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> racersMap = new TreeMap<>();

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

                if (racersList.contains(currentName)) { // Проверка дали присъстват в оригиналния списък!

                    if (!racersMap.containsKey(currentName)) {
                        racersMap.put(currentName, currentDistance);
                    } else {
                        int newMapValue = racersMap.get(currentName) + currentDistance;
                        racersMap.put(currentName, newMapValue);
                    }

                }

            }


            infoCommand = scan.nextLine();
        }
    }
}
