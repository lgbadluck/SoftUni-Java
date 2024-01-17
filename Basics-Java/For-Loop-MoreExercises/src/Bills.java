import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int periodInMonths = Integer.parseInt(scanner.nextLine());
        double totalBills = 0;
        double totalElectricityBills = 0;
        double totalWaterBills = 0;
        double totalInternetBills = 0;
        double totalOtherBills = 0;

        for (int i=1; i<=periodInMonths; i++) {
            double  electricityBill = Double.parseDouble(scanner.nextLine());
            totalElectricityBills+=electricityBill;
            totalWaterBills+=20.0;
            totalInternetBills+=15.0;
            totalOtherBills+= (electricityBill+20.0+15.0)*1.20;
        }

        totalBills = totalElectricityBills+totalWaterBills+totalInternetBills+totalOtherBills;
        System.out.printf("Electricity: %.2f lv\n", totalElectricityBills);
        System.out.printf("Water: %.2f lv\n", totalWaterBills);
        System.out.printf("Internet: %.2f lv\n", totalInternetBills);
        System.out.printf("Other: %.2f lv\n", totalOtherBills);
        System.out.printf("Average: %.2f lv\n", totalBills/periodInMonths);
    }
}
