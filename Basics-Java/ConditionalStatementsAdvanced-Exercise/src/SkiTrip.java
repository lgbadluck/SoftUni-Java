import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // INPUTS
        //Първи ред - дни за престой - цяло число в интервала [0...365]
        //Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        //Трети ред - оценка - "positive"  или "negative"
        int daysStayed = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String review = scanner.next();

        double totalPrice = 0.0;

        switch (typeOfRoom) {
            case "room for one person":
                totalPrice = (daysStayed-1) * 18.00;
                if (review.equals("positive")) {
                    totalPrice = totalPrice + (totalPrice * 0.25);
                } else if (review.equals("negative")) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case "apartment":
                totalPrice = (daysStayed-1) * 25.00;
                if (daysStayed < 10) {
                    totalPrice = totalPrice - (totalPrice * 0.30);
                } else if (daysStayed <= 15) {
                    totalPrice = totalPrice - (totalPrice * 0.35);
                } else if (daysStayed > 15) {
                    totalPrice = totalPrice - (totalPrice * 0.50);
                }
                if (review.equals("positive")) {
                    totalPrice = totalPrice + (totalPrice * 0.25);
                } else if (review.equals("negative")) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case "president apartment":
                totalPrice = (daysStayed-1) * 35.00;
                if (daysStayed < 10) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                } else if (daysStayed <= 15) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                } else if (daysStayed > 15) {
                    totalPrice = totalPrice - (totalPrice * 0.20);
                }
                if (review.equals("positive")) {
                    totalPrice = totalPrice + (totalPrice * 0.25);
                } else if (review.equals("negative")) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        System.out.printf("%.2f\n", totalPrice);



        // OUTPUTS
        //Цената за престоят му в хотела, форматирана до втория знак след десетичната запетая.
    }
}
