package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        List<Double> nextNumbers = sumAdjacent(numbers);

        while (nextNumbers.size() != numbers.size()) {
            numbers = nextNumbers;
            nextNumbers = sumAdjacent(numbers);


            for (double element : numbers) {
                System.out.print(element + " ");

            }
        }
    }

    private static List<Double> sumAdjacent(List<Double> numbers) {
        List<Double> nextNumbers = new ArrayList<>();

        int i = 0;

        while (i < numbers.size()) {
            if (i < numbers.size() - 1 && numbers.get(i) == numbers.get(i + 1)) {

                nextNumbers.add(numbers.get(i) + numbers.get(i + 1));

                i += 2;
            } else {
                nextNumbers.add(numbers.get(i));
                i++;
            }
        }

        return nextNumbers;
    }
}
