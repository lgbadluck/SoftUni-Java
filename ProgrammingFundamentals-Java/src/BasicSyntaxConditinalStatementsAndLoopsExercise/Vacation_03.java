package BasicSyntaxConditinalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudent = Integer.parseInt(scanner.nextLine());
        String typeOfClients = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0.0;

        switch (dayOfWeek) {
            case "Friday":
                if (typeOfClients.equals("Students")) {
                    price = 8.45;
                } else if (typeOfClients.equals("Business")) {
                    price = 10.90;
                } else if (typeOfClients.equals("Regular")) {
                    price = 15;
                }
                break;
            case "Saturday":
                if (typeOfClients.equals("Students")) {
                    price = 9.8;
                } else if (typeOfClients.equals("Business")) {
                    price = 15.60;
                } else if (typeOfClients.equals("Regular")) {
                    price = 20;
                }
                break;
            case "Sunday":
                if (typeOfClients.equals("Students")) {
                    price = 10.46;
                } else if (typeOfClients.equals("Business")) {
                    price = 16;
                } else if (typeOfClients.equals("Regular")) {
                    price = 22.50;
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }

        if (typeOfClients.equals("Students") && numOfStudent>= 30) {
            price -= (price * 0.15);
        }
        if (typeOfClients.equals("Business") && numOfStudent>= 100) {
            numOfStudent -= 10;
        }
        if (typeOfClients.equals("Regular") && numOfStudent>= 10 && numOfStudent<= 20) {
            price -= (price * 0.05);
        }
        System.out.printf("Total price: %.2f\n", price*numOfStudent);
    }
}
