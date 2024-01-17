import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // INPUTS
        //На първия ред е месецът – May, June, July, August, September или October
        //На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
        String monthOfYear = scanner.nextLine();
        int numNightsStayed = Integer.parseInt(scanner.nextLine());
        double apartmentPrice = 0.0;
        double studioPrice = 0.0;

        switch (monthOfYear) {
            case "May":
            case "October":
                apartmentPrice = 65.0;
                studioPrice = 50.0;
                if (numNightsStayed > 7 && numNightsStayed <= 14) {
                    studioPrice = studioPrice - (studioPrice * 0.05);
                } else if (numNightsStayed > 14) {
                studioPrice = studioPrice - (studioPrice * 0.30);
                apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
            }
            break;
            case "June":
            case "September":
                apartmentPrice = 68.70;
                studioPrice = 75.20;
                if (numNightsStayed > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.20);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
                break;
            case "July":
            case "August":
                apartmentPrice = 77.00;
                studioPrice = 76.00;
                if (numNightsStayed > 14) {
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
                break;
            default:
                System.out.printf("error");
                break;
        }

        // OUTPUTS
        //На първия ред: “Apartment: {цена за целият престой} lv.”
        //На втория ред: “Studio: {цена за целият престой} lv.“
        //Цената за целия престой форматирана с точност до два знака след десетичната запетая.
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.\n",
                apartmentPrice*numNightsStayed, studioPrice*numNightsStayed);
    }
}
