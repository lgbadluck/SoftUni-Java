package MapsLambdaStreamAPIsExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> coursesInfoMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("end")) {
            String courseName = input.split(":")[0].trim();
            String studentName = input.split(":")[1].trim();

            coursesInfoMap.putIfAbsent(courseName, new ArrayList<>());
            coursesInfoMap.get(courseName).add(studentName);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : coursesInfoMap.entrySet()) {
            System.out.printf("%s: %s", entry.getKey(), entry.getValue().size());
            System.out.printf("%s", entry.getValue().toString()
                    .replace("[","\n-- ")
                    .replace(",","\n--")
                    .replace("]","\n"));
        }
    }
}
