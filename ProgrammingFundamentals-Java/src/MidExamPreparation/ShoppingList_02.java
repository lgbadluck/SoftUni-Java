package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.next().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String command = input.split(" ")[0];
            if (command.equals("Urgent")) {
                String item = input.split(" ")[1];
                if (!shoppingList.contains(item)) {
                    shoppingList.add(0, item);
                }
            } else if (command.equals("Unnecessary")) {
                String item = input.split(" ")[1];
                shoppingList.remove(item);
            } else if (command.equals("Correct")) {
                String oldItem = input.split(" ")[1];
                String newItem = input.split(" ")[2];
                if (shoppingList.contains(oldItem)) {
                    int idxOldItem = shoppingList.indexOf(oldItem);
                    shoppingList.set(idxOldItem, newItem);
                }
            } else if (command.equals("Rearrange")) {
                String item = input.split(" ")[1];
                if (shoppingList.contains(item)) {
                    shoppingList.remove(item);
                    shoppingList.add(item);
                }
            }
            input = scanner.nextLine();
        }

        System.out.println(shoppingList.toString().replace("[", "").replace("]", ""));
    }
}
