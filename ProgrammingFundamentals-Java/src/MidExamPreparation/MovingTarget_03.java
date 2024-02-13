package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            if (input.contains("Shoot")) {
                //String command = input.split(" ")[0];
                int index = Integer.parseInt(input.split(" ")[1]);
                int power = Integer.parseInt(input.split(" ")[2]);
                if (index >= 0 && index < targetsList.size()) {
                    int currentTargetPower = targetsList.get(index);
                    currentTargetPower -= power;
                    if (currentTargetPower <= 0) {
                        targetsList.remove(index);
                    } else {
                        targetsList.set(index, currentTargetPower);
                    }
                }
            } else if (input.contains("Add")) {
                //String command = input.split(" ")[0];
                int index = Integer.parseInt(input.split(" ")[1]);
                int value = Integer.parseInt(input.split(" ")[2]);
                if (index >= 0 && index < targetsList.size()) {
                    targetsList.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (input.contains("Strike")) {
                //String command = input.split(" ")[0];
                int index = Integer.parseInt(input.split(" ")[1]);
                int radius = Integer.parseInt(input.split(" ")[2]);
                int startIdx = index - Math.abs(radius);
                int endIdx = index + Math.abs(radius);
                if (startIdx >= 0 && startIdx < targetsList.size() && endIdx >= 0 && endIdx < targetsList.size()) {
                    for (int i = endIdx; i >= startIdx; i--) {
                        targetsList.remove(startIdx);
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(targetsList.toString().replace("[", "").replace("]", "").replace(", ", "|"));
    }
}
