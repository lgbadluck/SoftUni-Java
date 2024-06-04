package SetsAndMapsAdvancedLabs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class _04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Object LinkedHashMap;
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
