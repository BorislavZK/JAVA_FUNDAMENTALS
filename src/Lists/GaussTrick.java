package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> numList = new ArrayList<>();


        for (int i = 0; i < numbersArr.length ; i++) {
            numList.add(numbersArr[i]);
        }


        int sizeList = numList.size();

        for (int i = 0; i < sizeList / 2; i++) {
            int firstNum = numList.get(i);
            int secondNum = numList.get(numList.size() - 1);

            numList.set(i,numList.get(i)+ numList.get(numList.size()-1));

            numList.remove(numList.size()-1);

        }

        for (int elements : numList) {
            System.out.print(elements + " ");

        }

    }
}

