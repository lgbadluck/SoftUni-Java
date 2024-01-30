package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int size = numbers.size();
        for (int i = 0; i < size/2; i++) {
            numbers.set(i, ( numbers.get(i) + numbers.get(size-1-i)) );
            numbers.remove(size-1-i);
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
