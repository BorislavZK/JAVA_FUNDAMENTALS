package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> countNums = new TreeMap<>();

        for (double currentNum : nums) {
            Integer currentValue = countNums.get(currentNum);

            if (countNums.containsKey(currentNum)) {
                countNums.put(currentNum, currentValue + 1);
            } else {
               countNums.put(currentNum,1);
            }
        }

        for (Map.Entry<Double, Integer> entry : countNums.entrySet()) {

            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
