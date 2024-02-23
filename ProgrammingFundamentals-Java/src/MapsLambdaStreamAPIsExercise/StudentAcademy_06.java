package MapsLambdaStreamAPIsExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<Double>> studentGradesMap = new LinkedHashMap<>();

        while (n>0) {
            String studentName = scanner.nextLine();
            Double thisGrade = Double.parseDouble(scanner.nextLine());

            studentGradesMap.putIfAbsent(studentName, new ArrayList<>());
            studentGradesMap.get(studentName).add(thisGrade);

            n--;
        }

        //System.out.println(studentGradesMap.toString());
        for (Map.Entry<String, ArrayList<Double>> entry : studentGradesMap.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            if (average >= 4.50) System.out.printf("%s -> %.2f\n", entry.getKey(), average);
        }
    }
}
