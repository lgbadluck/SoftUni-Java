package RegularExpressionsExercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[>]{2}(?<productName>\\w+)[<]{2}(?<price>\\d+[.]?\\d*)!(?<quantity>\\d+)";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        double totalSum = 0;
        List<String> products = new LinkedList<>();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                totalSum += Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("quantity"));
                products.add(matcher.group("productName"));
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String product : products) {
            System.out.println(product);
        }
        System.out.printf("Total money spend: %.2f\n", totalSum);
    }
}
