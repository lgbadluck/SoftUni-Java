package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        double total = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                String count = matcher.group("count");
                String price = matcher.group("price");
                double priceOfProduct = Double.parseDouble(price)*Integer.parseInt(count);
                total+=priceOfProduct;
                System.out.printf("%s: %s - %.2f\n", name, product, priceOfProduct);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f\n", total);
    }
}
