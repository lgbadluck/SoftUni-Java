package _01_WorkingWithAbstractionExercise._06_GreedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagMaxCapacity = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long goldAmount = 0;
        long gemstonesAmount = 0;
        long cashAmount = 0;

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long amount = Long.parseLong(safe[i + 1]);

            if (amount + cashAmount + gemstonesAmount + goldAmount > bagMaxCapacity) {
                continue;
            }

            String element = "";

            if (name.length() == 3) {
                element = "Cash";
                if (gemstonesAmount < amount + cashAmount) {
                    continue;
                }
            } else if (name.toLowerCase().endsWith("gem")) {
                element = "Gem";
                if (goldAmount < amount + gemstonesAmount) {
                    continue;
                }
            } else if (name.toLowerCase().equals("gold")) {
                element = "Gold";
                name = element;
            } else continue;

            bag.putIfAbsent((element), new LinkedHashMap<>());
            bag.get(element)
                    .putIfAbsent(name, 0L);
            long prevAmount = bag.get(element).get(name);
            bag.get(element)
                    .put(name, prevAmount + amount);

            switch (element) {
                case "Cash" -> cashAmount += amount;
                case "Gold" -> goldAmount += amount;
                case "Gem" -> gemstonesAmount += amount;
            }

        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : bag.entrySet()) {
            Long sumValues = entry.getValue().values().stream().mapToLong(l -> l).sum();
            System.out.printf("<%s> $%s\n", entry.getKey(), sumValues);

            entry.getValue().entrySet()
                    .stream()
                    .sorted((e1, e2) -> e2.getKey()
                            .compareTo(e1.getKey()))
                    .forEach(item -> System.out.printf("##%s - %d\n", item.getKey(), item.getValue()));
        }
    }
}