import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String typeOfVacation = "";
        double priceToPay = 0;

        if (budget<=1000) {
            typeOfVacation = "Camp";
            if (season.equals("Summer") ) {
                location = "Alaska";
                priceToPay = budget*0.65;
            }
            if (season.equals("Winter") ) {
                location = "Morocco";
                priceToPay = budget*0.45;
            }
        } else if (budget>1000 && budget<=3000) {
            typeOfVacation = "Hut";
            if (season.equals("Summer") ) {
                location = "Alaska";
                priceToPay = budget*0.80;
            }
            if (season.equals("Winter") ) {
                location = "Morocco";
                priceToPay = budget*0.60;
            }
        } else if (budget>3000) {
            typeOfVacation = "Hotel";
            if (season.equals("Summer") ) {
                location = "Alaska";
                priceToPay = budget*0.90;
            }
            if (season.equals("Winter") ) {
                location = "Morocco";
                priceToPay = budget*0.90;
            }
        }

        System.out.printf("%s - %s - %.2f\n", location, typeOfVacation, priceToPay);
    }
}
