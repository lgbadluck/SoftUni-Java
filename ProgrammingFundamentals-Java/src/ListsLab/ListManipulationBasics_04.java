package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        while(!input[0].equals("end")) {
            String cmd1 = input[0];
            double cmd2 = Double.parseDouble(input[1]);
            double cmd3 = 0;
            if (input.length==3) cmd3 = Double.parseDouble(input[2]);

            switch (cmd1) {
                case "Add": numbers.add(cmd2); break;
                case "Remove": numbers.remove((Double)cmd2); break;
                case "RemoveAt": numbers.remove((int)cmd2); break;
                case "Insert": numbers.add((int)cmd3, (Double)cmd2); break;
                default:
                    System.out.println("Error");
                    break;
            }

            input = scanner.nextLine().split(" ");
        }

        System.out.println(joinElementsByDelimiter(numbers, " "));
    }
    public static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items)
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        return output;
    }
}
