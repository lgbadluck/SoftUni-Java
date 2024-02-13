package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.valueOf;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countShotTargets = 0;

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int targetIdx = Integer.parseInt(input);

            if (targetIdx >= 0 && targetIdx < targetsList.size()) {
                int currentTargetPower = targetsList.get(targetIdx);
                targetsList.set(targetIdx, valueOf(-1));
                countShotTargets++;
                for (int i = 0; i < targetsList.size(); i++) {
                    int thisTargetPower = targetsList.get(i);
                    if(thisTargetPower != -1 ) {
                        if(thisTargetPower > currentTargetPower) {
                            targetsList.set(i, thisTargetPower-currentTargetPower);
                        } else {
                            targetsList.set(i, thisTargetPower+currentTargetPower);
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.print("Shot targets: " + countShotTargets + " -> ");
        System.out.println(targetsList.toString().replace("[", "").replace("]", "").replace(", ", " "));
    }
}
