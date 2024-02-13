package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> housesList = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int cupidCurrentPos = 0;
        while (!input.equals("Love!")) {
            int jumpDistance = Integer.parseInt(input.split(" ")[1]);

            cupidCurrentPos += jumpDistance;
            if (cupidCurrentPos >= housesList.size()) {
                //cupidCurrentPos = cupidCurrentPos % housesList.size();
                cupidCurrentPos = 0;
            }
            int currentHouseHeartsNeeded = housesList.get(cupidCurrentPos);
            if (currentHouseHeartsNeeded <= 0) {
                System.out.println("Place " + cupidCurrentPos + " already had Valentine's day.");
                input = scanner.nextLine();
                continue;
            } else {
                housesList.set(cupidCurrentPos, currentHouseHeartsNeeded - 2);
            }

            if (housesList.get(cupidCurrentPos) == 0) {
                System.out.println("Place " + cupidCurrentPos + " has Valentine's day.");
            }
            input = scanner.nextLine();
        }

        System.out.println("Cupid's last position was " + cupidCurrentPos + ".");
        int countHousesNotVisited = 0;
        for (int i = 0; i < housesList.size(); i++) {
            if (housesList.get(i) > 0) {
                countHousesNotVisited++;
            }
        }
        if (countHousesNotVisited == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.println("Cupid has failed " + countHousesNotVisited + " places.");
        }
    }
}
