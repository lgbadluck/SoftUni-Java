import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // INPUTS:
        //Име на актьора - текст
        //Точки от академията - реално число в интервала [2.0... 450.5]
        //Брой оценяващи n - цяло число в интервала[1… 20]
        //На следващите n-на брой реда:
        //Име на оценяващия - текст
        //Точки от оценяващия - реално число в интервала [1.0... 50.0]
        double sumOfPointsAwarded = 0.0;
        String nameOfActor = scanner.nextLine();
        double pointsAwardedAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double  pointsNeededForNomination = 1250.5;

        sumOfPointsAwarded = pointsAwardedAcademy;
        for (int i=1; i<=n; i++) {
            String nameOfJudge = scanner.nextLine();
            double pointsAwardedFromJudge = Double.parseDouble(scanner.nextLine());
            sumOfPointsAwarded += (nameOfJudge.length()*pointsAwardedFromJudge)/2;
            if (sumOfPointsAwarded >= pointsNeededForNomination) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!\n", nameOfActor, sumOfPointsAwarded);
                break;
            }
        }
        // OUTPUTS:
        //Да се отпечата на конзолата един ред:
        //Ако точките са над 1250.5:
        //"Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
        //Ако точките не са достатъчни:
        //	"Sorry, {име на актьора} you need {нужни точки} more!"
        //Резултатът да се форматирана до първата цифра след десетичния знак!
        if (sumOfPointsAwarded < pointsNeededForNomination) {
            System.out.printf("Sorry, %s you need %.1f more!\n", nameOfActor, (pointsNeededForNomination - sumOfPointsAwarded));
        }
    }
}
