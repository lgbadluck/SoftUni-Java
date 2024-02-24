package MapsLambdaStreamAPIsExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> submissionsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> userMaxPointsMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String userName = input.split("-")[0];
            String language = input.split("-")[1];
            int points;
            if (!language.equals("banned")) {
                points = Integer.parseInt(input.split("-")[2]);

                //We have received all data in format "{username}-{language}-{points}"
                //Put it in the correct Key-Value Maps
                //Save Max points for user
                userMaxPointsMap.putIfAbsent(userName, 0);
                userMaxPointsMap.put(userName, Math.max(points, userMaxPointsMap.get(userName)));
                //Save languages in a List "For language: {language} {userName} got {points} points." entry
                submissionsMap.putIfAbsent(language, new ArrayList<>());
                submissionsMap.get(language).add("For language: " + language + " " + userName + " got " + points + " points.");
            } else {
                userMaxPointsMap.remove(userName);
            }
            input = scanner.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : userMaxPointsMap.entrySet()) {
            System.out.printf("%s | %d\n", entry.getKey(), entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, ArrayList<String>> entry : submissionsMap.entrySet()) {
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue().size());
        }
    }
}
