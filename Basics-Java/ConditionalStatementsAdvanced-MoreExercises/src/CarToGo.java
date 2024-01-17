import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass =  "NoClass";
        String carType =  "NoType";
        double priceOfCar = 0;

        if (budget<=100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                priceOfCar = budget*0.35;
            }
            if (season.equals("Winter")) {
                carType = "Jeep";
                priceOfCar = budget*0.65;
            }
        } else if (budget<500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                priceOfCar = budget * 0.45;
            }
            if (season.equals("Winter")) {
                carType = "Jeep";
                priceOfCar = budget * 0.80;
            }
        } else if (budget>500) {
            carClass = "Luxury class";
            carType = "Jeep";
            priceOfCar= budget*0.90;
        }

        System.out.printf("%s\n%s - %.2f\n", carClass, carType, priceOfCar);
    }
}
