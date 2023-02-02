package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scan.nextLine();

        while (!line.equals("end")) {

            String[] data = line.split("\\s+");
            String command = data[0];
            int element = Integer.parseInt(data[1]);

            if (data[0].equals("Delete")) {
                // ELEMENT TO SINGLE LIST

                //numbers.removeAll(Collections.singletonList(element));

                //numbers.removeAll(Arrays.asList(element));

                //FOR-LOOP
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == element) {
                        numbers.remove(i);
                        i--;
                    }

                }
            } else if (data[0].equals("Insert")) {
                int index = Integer.parseInt(data[2]);
                numbers.add(index, element);
                break;
            }

            line = scan.nextLine();
        }

        numbers.forEach(el -> System.out.print(el + " "));
    }
}
