package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainListExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());

        String line = scan.nextLine();

        while (!line.equals("end")){

            String[] data = line.split("\\s+");

            if ( data[0].equals("Add")){
                train.add(Integer.parseInt(data[1]));
            }else{
                int passangers = Integer.parseInt(data[0]);

                for (int i = 0; i < train.size(); i++) {
                    if (train.get(i) + passangers <= maxCapacity){
                        train.set(i, train.get(i) + passangers);
                        break;
                    }
                }
            }

            line = scan.nextLine();
        }

        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));

    }
}
