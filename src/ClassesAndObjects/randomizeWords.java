package ClassesAndObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class randomizeWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<String> stringList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());


        while (!stringList.isEmpty()){

            Random rnd = new Random();  // NEW RANDOM
            int randomIndex = rnd.nextInt(stringList.size()); //NEW RANDOM INT WITH BOUND!!!

            String randomWord = stringList.get(randomIndex); // GET RANDOM WORD

            System.out.println(randomWord); // PRINT

            stringList.remove(randomIndex);    //REMOVE THE RANDOM POSITION

        }

    }
}
