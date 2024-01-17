import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
        //•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
        //•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
        //•	4ти ред: брой работници – цяло число в интервала [1 … 20]
        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int numWorkers = Integer.parseInt(scanner.nextLine());

        double litresWineProduced = ( (X*0.4) * Y ) / 2.5;
        //double remainingLitresWine = Math.abs(Z-litresWineProduced);

        if (litresWineProduced < Z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.\n", Math.floor(Z-litresWineProduced) );
        } else if (litresWineProduced>=Z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(litresWineProduced) );
            System.out.printf("%.0f liters left -> %.0f liters per person.\n", Math.ceil(litresWineProduced-Z), Math.ceil( (litresWineProduced-Z) / numWorkers )  );
        }

        //•	Ако произведеното вино е по-малко от нужното:
        //o	“It will be a tough winter! More {недостигащо вино} liters wine needed.”
        //	Резултатът трябва да е закръглен към по-ниско цяло число
        //•	Ако произведеното вино е колкото или повече от нужното:
        //o	“Good harvest this year! Total wine: {общо вино} liters.”
        //	Резултатът трябва да е закръглен към по-ниско цяло число
        //o	“{Оставащо вино} liters left -> {вино за 1 работник} liters per person.”
        //	И двата резултата трябва да са закръглени към по-високото цяло число

    }
}
