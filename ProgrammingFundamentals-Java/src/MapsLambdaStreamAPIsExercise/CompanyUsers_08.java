package MapsLambdaStreamAPIsExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> studentGradesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String companyName = input.split("->")[0].trim();
            String studentName = input.split("->")[1].trim();

            studentGradesMap.putIfAbsent(companyName, new ArrayList<>());
            if (!studentGradesMap.get(companyName).contains(studentName)) studentGradesMap.get(companyName).add(studentName);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : studentGradesMap.entrySet()) {
            System.out.printf("%s", entry.getKey());
            System.out.printf("%s", entry.getValue().toString()
                    .replace("[","\n-- ")
                    .replace(",","\n--")
                    .replace("]","\n"));
        }
    }
}
