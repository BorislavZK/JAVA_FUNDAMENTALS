package MidExamPreparation;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        int[] inputIntegers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            inputIntegers[i] = Integer.parseInt(input[i]);
        }

        //average value
        int intArraySum = 0;
        for (int i = 0; i < inputIntegers.length; i++) {
            intArraySum += inputIntegers[i];
        }
        double averageValue = 1.00 * intArraySum / inputIntegers.length;

        List<Integer> numList = new ArrayList<>();


        for (int i = 0; i < inputIntegers.length; i++) {

            if (inputIntegers[i] > averageValue) {
                numList.add(inputIntegers[i]);
            }

        }

        Collections.sort(numList);
        Collections.reverse(numList);

        if (numList.isEmpty()) {
            System.out.println("No");
        } else {

            for (int i = 0; i < numList.size(); i++) {
                System.out.print(numList.get(i) + " ");
                if (i == 4) {
                    break;
                }

            }

        }


    }
}
