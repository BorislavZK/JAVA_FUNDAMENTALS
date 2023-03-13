package AssociativeArrays;

import java.util.*;

public class StudentAcademy06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> nameAndGrade = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {

            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            if (!nameAndGrade.containsKey(name)) {
                nameAndGrade.put(name, new ArrayList<>());
                nameAndGrade.get(name).add(grade);
            } else {
                nameAndGrade.get(name).add(grade);
            }
        }
        //John -> 5.00

        for (Map.Entry<String, List<Double>> entry : nameAndGrade.entrySet()) {
            double avgScore = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                avgScore += entry.getValue().get(i);
            }
            avgScore /= entry.getValue().size();
            nameAndGrade.get(entry.getKey()).add(avgScore);
        }

        //John -> 5.00

        for (Map.Entry<String, List<Double>> entry : nameAndGrade.entrySet()) {
            double currentAvgScore = entry.getValue().get(entry.getValue().size() - 1);
            if (currentAvgScore >= 4.50) {
                System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue().get(entry.getValue().size() - 1));
            }

        }
    }

}

