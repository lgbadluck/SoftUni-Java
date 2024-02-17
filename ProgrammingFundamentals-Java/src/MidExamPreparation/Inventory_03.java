package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> materialsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            if (input.contains("Collect")) {
                String item = input.split(" - ")[1];
                if (!materialsList.contains(item)) materialsList.add(item);
            } else if (input.contains("Drop")) {
                String item = input.split(" - ")[1];
                materialsList.remove(item);
            } else if (input.contains("Renew")) {
                String item = input.split(" - ")[1];
                if (materialsList.contains(item)) {
                    int idxItem = materialsList.indexOf(item);
                    materialsList.add(item);
                    materialsList.remove(idxItem);
                }
            } else if (input.contains("Combine Items")) {
                String itemsToCombine = input.split(" - ")[1];
                String oldItem = itemsToCombine.split(":")[0];
                String newItem = itemsToCombine.split(":")[1];
                if (materialsList.contains(oldItem)) {
                    int idxOldItem = materialsList.indexOf(oldItem);
                    materialsList.add(idxOldItem + 1, newItem);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(materialsList.toString()
                .replace("[", "")
                .replace("]", "")
        );
    }
}
