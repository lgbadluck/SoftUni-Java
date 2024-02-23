package MapsLambdaStreamAPIsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> minersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("stop")) {
            String resource = input;
            double quantity = Double.parseDouble(scanner.nextLine());

            if(!minersMap.containsKey(resource)) {
                minersMap.put(resource, 0.0);
            }
            minersMap.put(resource, minersMap.get(resource) + quantity);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : minersMap.entrySet()) {
            System.out.printf("%s -> %.0f\n", entry.getKey(), entry.getValue() );
        }
    }
}
