package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int smallestSize = 0;

        if (firstList.size() < secondList.size()) {  // CAN BE REPLACED WITH Math.min
            smallestSize = firstList.size();
        } else {
            smallestSize = secondList.size();
        }


        for (int i = 0; i < smallestSize; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }

        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(smallestSize, firstList.size()));
        } else {
            resultList.addAll(secondList.subList(smallestSize, secondList.size()));
        }

        for (Integer results : resultList) {
            System.out.print(results + " ");

        }


    }
}
