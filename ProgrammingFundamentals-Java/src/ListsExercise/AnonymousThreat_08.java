package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("[ ]");
        while (!command[0].equals("3:1")) {
            String cmd1 = command[0];
            //System.out.println(cmd1);
            switch (cmd1) {
                case "merge":
                    int start = Integer.parseInt(command[1]);
                    int end = Integer.parseInt(command[2]);
                    mergeTheList(arrays, start, end);
                    break;
                case "divide":
                    int index = Integer.parseInt(command[1]);
                    int partitions = Integer.parseInt(command[2]);
                    divideTheList(arrays, index, partitions);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
            //System.out.println(arrays);
            command = scanner.nextLine().split("[ ]");
        }
        System.out.println(arrays.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void mergeTheList(List<String> list, int startIdx, int endIdx) {
        if (startIdx < 0) startIdx = 0;
        if (endIdx > list.size() - 1) endIdx = list.size() - 1;

        for (int i = startIdx; i < endIdx; i++) {
            list.set(startIdx+1, (list.get(startIdx) + list.get(startIdx + 1)));
            list.remove(startIdx);
        }
    }

    public static void divideTheList(List<String> list, int idx, int part) {
        String toChop = list.get(idx);
        String chopped = "";
        list.remove(idx);
        List<String> divided = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < toChop.length(); i++) {
            chopped += toChop.charAt(i);
            if (toChop.length() % part == 0) {
                if (chopped.length() == (toChop.length() / part)) {
                    divided.add(chopped);
                    chopped = "";
                    count++;
                }
            } else {
                if (chopped.length() == (toChop.length() / part) && (count != part - 1)) {
                    divided.add(chopped);
                    chopped = "";
                    count++;
                }
            }
        }
        if (toChop.length() % part != 0) {
            divided.add(chopped);
        }
        list.addAll(idx, divided);
    }
}
