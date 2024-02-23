package MapsLambdaStreamAPIsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> productPricesMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productQuantitiesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("buy")) {
            String productName = input.split(" ")[0];
            Double productPrice = Double.parseDouble(input.split(" ")[1]);
            Integer productQuantity = Integer.parseInt(input.split(" ")[2]);

            if(!productPricesMap.containsKey(productName)) {
                productPricesMap.put(productName, 0.0);
            }
            productPricesMap.put(productName, productPrice);

            if(!productQuantitiesMap.containsKey(productName)) {
                productQuantitiesMap.put(productName, 0);
            }
            productQuantitiesMap.put(productName, productQuantitiesMap.get(productName)+productQuantity);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productPricesMap.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()*productQuantitiesMap.get(entry.getKey()).doubleValue());
        }
    }
}
