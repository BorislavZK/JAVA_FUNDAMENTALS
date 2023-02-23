package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringArrToIntArr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        https://www.techiedelight.com/convert-string-array-to-int-array-java/



        1. Using Stream API

        You can use the static factory method
        Arrays.stream() to get a Stream for the array, convert each element to an
        integer using the Integer.parseInt() method, and then call the toArray() method to
        accumulate the stream elements into an int primitive array.



           int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();





        String[] strings = {"1", "2", "3", "4", "5"};

        int[] values = Arrays.stream(strings)
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Arrays.toString(values));

         */

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();




        /*

        Note that the Integer.parseInt() method throws NumberFormatException
        if the string is not parsable. You can also obtain a stream consisting of
        elements from the String array using the static factory method Stream.of().


        String[] strings = {"1", "2", "3", "4", "5"};

        int[] values = Stream.of(strings)
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Arrays.toString(values));

         */



        /*

        If you need an Integer array instead of a primitive int array, you can do like:


        String[] strings = {"1", "2", "3", "4", "5"};

        Integer[] values = Arrays.stream(strings)
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(values));

         */


        /*

        Finally, if you need a List<Integer> from a String[],
        you can use collectors to collect the stream elements into a List.


        String[] strings = {"1", "2", "3", "4", "5"};

        List<Integer> values = Arrays.stream(strings)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(values);


         */


        /*

        2. Using Custom Routine

        Another solution is to write your own custom method for this easy task,
        which creates a new array and copy the elements from the original array
        to the new array after converting each element from string to the integer.
        A typical implementation for this approach would look like below.


        String[] strings = {"1", "2", "3", "4", "5"};

        int[] values = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            values[i] = Integer.parseInt(strings[i]);
        }

        System.out.println(Arrays.toString(values));



         */


         // LIST

//        String input = scan.nextLine();
//        List<String> stringList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());


    }
}
