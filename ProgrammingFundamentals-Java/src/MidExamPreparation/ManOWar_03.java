package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealthCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            if (input.contains("Fire")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int damage = Integer.parseInt(input.split(" ")[2]);
                if (index >= 0 && index < warShip.size()) {
                    int warShipSectionHP = warShip.get(index);
                    warShipSectionHP -= damage;
                    if (warShipSectionHP <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    } else {
                        warShip.set(index, warShipSectionHP);
                    }
                }
                //System.out.println("WarShip: " + warShip.toString().replace("[", "").replace("]", ""));
            } else if (input.contains("Defend")) {
                int startIdx = Integer.parseInt(input.split(" ")[1]);
                int endIdx = Integer.parseInt(input.split(" ")[2]);
                int damage = Integer.parseInt(input.split(" ")[3]);
                if (startIdx >= 0 && startIdx < pirateShip.size() && endIdx >= 0 && endIdx < pirateShip.size()) {
                    for (int i = startIdx; i <= endIdx; i++) {
                        int pirateShipSectionHP = pirateShip.get(i);
                        pirateShipSectionHP -= damage;
                        if (pirateShipSectionHP <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        } else {
                            pirateShip.set(i, pirateShipSectionHP);
                        }
                    }
                }
                //System.out.println("PirateShip: " + pirateShip.toString().replace("[", "").replace("]", ""));
            } else if (input.contains("Repair")) {
                //System.out.println("PirateShip: " + pirateShip.toString().replace("[", "").replace("]", ""));
                int index = Integer.parseInt(input.split(" ")[1]);
                int health = Integer.parseInt(input.split(" ")[2]);
                if (index >= 0 && index < pirateShip.size()) {
                    int pirateShipSectionHP = pirateShip.get(index);
                    pirateShipSectionHP += health;
                    if (pirateShipSectionHP > maxHealthCapacity) {
                        pirateShipSectionHP = maxHealthCapacity;
                    }
                    pirateShip.set(index, pirateShipSectionHP);
                }
                //System.out.println("PirateShip: " + pirateShip.toString().replace("[", "").replace("]", ""));
            } else if (input.contains("Status")) {
                //System.out.println("PirateShip: " + pirateShip.toString().replace("[", "").replace("]", ""));
                int countDamagedSections = 0;
                for (int sectionHealth : pirateShip) {
                    if (sectionHealth < maxHealthCapacity*0.20) countDamagedSections++;
                }
                System.out.println(countDamagedSections + " sections need repair.");
                //System.out.println("PirateShip: " + pirateShip.toString().replace("[", "").replace("]", ""));
            }

            input = scanner.nextLine();
        }

        int sumHealthPirateShip = 0;
        for (int sectionHealth : pirateShip) {
            sumHealthPirateShip+=sectionHealth;
        }
        int sumHealthWarShip = 0;
        for (int sectionHealth : warShip) {
            sumHealthWarShip+=sectionHealth;
        }

        System.out.printf("Pirate ship status: %d\nWarship status: %d\n", sumHealthPirateShip, sumHealthWarShip);
    }
}
