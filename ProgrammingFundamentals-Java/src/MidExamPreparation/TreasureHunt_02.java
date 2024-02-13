package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasureList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            if (input.contains("Loot")) {
                List<String> newLoot = Arrays.stream(input.split(" "))
                        .collect(Collectors.toList());
                newLoot.remove(0); // removes Command => list has only treasures to add.
                //System.out.println(treasureList.toString().replace("[", "").replace("]", ""));
                for (String loot : newLoot) {
                    if (!treasureList.contains(loot)) treasureList.add(0, loot);
                }
                //System.out.println(treasureList.toString().replace("[", "").replace("]", ""));
            } else if (input.contains("Drop")) {
                //System.out.println(treasureList.toString().replace("[", "").replace("]", ""));
                int index = Integer.parseInt(input.split(" ")[1]);
                if (index >= 0 && index < treasureList.size()) {
                    String thisLoot = treasureList.get(index);
                    treasureList.remove(thisLoot);
                    treasureList.add(thisLoot);
                }
                //System.out.println(treasureList.toString().replace("[", "").replace("]", ""));
            } else if (input.contains("Steal")) {
                //System.out.println(treasureList.toString().replace("[", "").replace("]", ""));
                int stealCount = Integer.parseInt(input.split(" ")[1]);
                List<String> stolenList = new ArrayList<>();
                if (stealCount > treasureList.size()) {
                    stealCount = treasureList.size();
                }
                //System.out.println(treasureList.toString().replace("[", "").replace("]", ""));
                for (int i = treasureList.size() - 1; i >= treasureList.size() - stealCount; i--) {
                    String toSteal = treasureList.get(i);
                    //treasureList.remove(i);
                    stolenList.add(0, toSteal);
                }
                System.out.println(stolenList.toString().replace("[", "").replace("]", ""));
                //System.out.println(treasureList.toString().replace("[", "").replace("]", ""));
                treasureList.removeAll(stolenList);
                //System.out.println(treasureList.toString().replace("[", "").replace("]", ""));
            }

            input = scanner.nextLine();
        }
        int sumTreasuresLen = 0;
        double avgGain = 0.0;
        for (int i = 0; i < treasureList.size(); i++) {
            sumTreasuresLen += treasureList.get(i).length();
        }
        avgGain = (double) sumTreasuresLen / treasureList.size();

        if (treasureList.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.\n", avgGain);
        }
    }
}
