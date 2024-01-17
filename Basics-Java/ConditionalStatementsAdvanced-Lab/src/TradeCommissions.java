import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double salesAmount = Double.parseDouble(scanner.nextLine());

        double commission = -1.0;

        switch (city) {
            case "Sofia": if ( (salesAmount >= 0) && (salesAmount <= 500) ) {
                commission = salesAmount * 0.05;
            } else if (salesAmount <= 1000) {
                commission = salesAmount * 0.07;
            } else if (salesAmount <= 10000) {
                commission = salesAmount * 0.08;
            } else if (salesAmount > 10000) {
                commission = salesAmount * 0.12;
            } break;
            case "Varna": if ( (salesAmount) >= 0 && (salesAmount <= 500) ) {
                commission = salesAmount * 0.045;
            } else if (salesAmount <= 1000) {
                commission = salesAmount * 0.075;
            } else if (salesAmount <= 10000) {
                commission = salesAmount * 0.10;
            } else if (salesAmount > 10000) {
                commission = salesAmount * 0.13;
            } break;
            case "Plovdiv": if ( (salesAmount) >= 0 && (salesAmount <= 500) ) {
                commission = salesAmount * 0.055;
            } else if (salesAmount <= 1000) {
                commission = salesAmount * 0.08;
            } else if (salesAmount <= 10000) {
                commission = salesAmount * 0.12;
            } else if (salesAmount > 10000) {
                commission = salesAmount * 0.145;
            } break;
            default:
                System.out.println("error"); commission = -9000.0; break;
        }

        if (commission <= -1.0 && !(commission == -9000.0)) {
            System.out.println("error");
        }
        if (commission >= 0) {
            System.out.printf("%.2f\n", commission);
        }
    }
}
