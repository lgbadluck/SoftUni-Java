import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Inputs
        //Входът се чете от конзолата и се състои от два реда, въведени от потребителя:
        //Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
        //Втори ред –  Един от двата възможни сезона: „summer” или “winter”
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double moneySpent = 0.0;
        String destination = "";
        String typeOfVacation = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                moneySpent = (budget * 0.30);
                typeOfVacation = "Camp";
            } else if (season.equals("winter")) {
                moneySpent = (budget * 0.70);
                typeOfVacation = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                moneySpent = (budget * 0.40);
                typeOfVacation = "Camp";
            } else if (season.equals("winter")) {
                moneySpent = (budget * 0.80);
                typeOfVacation = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            typeOfVacation = "Hotel";
            //if (season.equals("summer")) {
                moneySpent = (budget * 0.90);
            //} else if (season.equals("winter")) {
            //    moneySpent = budget - (budget * 0.90);
            //}
        }
        // Outputs
        //Първи ред – "Somewhere in [дестинация]“ измежду "Bulgaria", "Balkans" и "Europe"
        //Втори ред – "{Вид почивка} – {Похарчена сума}"
        //Почивката може да е между "Camp" и "Hotel"
        //Сумата трябва да е закръглена с точност до вторият знак след запетаята.
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f\n", typeOfVacation, moneySpent);
    }
}
