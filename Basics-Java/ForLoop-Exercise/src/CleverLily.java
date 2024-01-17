import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // INPUTS:
        //Програмата прочита 3 числа, въведени от потребителя, на отделни редове:
        //Възрастта на Лили - цяло число в интервала [1...77]
        //Цената на пералнята - число в интервала [1.00...10 000.00]
        //Единична цена на играчка - цяло число в интервала [0...40]
        int ageOfLily = Integer.parseInt(scanner.nextLine());
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceOfSingleToy = Integer.parseInt(scanner.nextLine());

        double totalMoneySaved = 0.0;
        double moneyBigBrotherTakes = 0.0;
        // LOGIC:
        //или вече е на N години. За всеки свой рожден ден тя получава подарък.
        //За нечетните рождени дни (1, 3, 5...n) получава играчки.
        //За четните рождени дни (2, 4, 6...n) получава пари.
        //За втория рожден ден получава 10.00 лв, като сумата се увеличава с 10.00 лв.,
        // за всеки следващ четен рожден ден (2 -> 10, 4 -> 20, 6 -> 30...и т.н.).
        // През годините Лили тайно е спестявала парите. Братът на Лили, в годините,
        // които тя получава пари, взима по 1.00 лев от тях. Лили продала играчките получени през годините,
        // всяка за P лева и добавила сумата към спестените пари.
        // С парите искала да си купи пералня за X лева.
        // Напишете програма, която да пресмята, колко пари е събрала и дали ѝ стигат да си купи пералня.
        for (int i=1; i<=ageOfLily; i++) {
            if (i%2==0) {
                totalMoneySaved += 10 * (i/2);
                moneyBigBrotherTakes += 1;
            } else {totalMoneySaved += priceOfSingleToy;}
        }

        totalMoneySaved -= moneyBigBrotherTakes;

        // OUTPUTS:
        //Да се отпечата на конзолата един ред:
        //Ако парите на Лили са достатъчни:
        //"Yes! {N}" - където N е остатъка пари след покупката
        //Ако парите не са достатъчни:
        //"No! {М}" - където M е сумата, която не достига
        if (totalMoneySaved >= priceOfWashingMachine) {
            System.out.printf("Yes! %.2f\n", Math.abs(totalMoneySaved-priceOfWashingMachine));
        } else {System.out.printf("No! %.2f\n", Math.abs(totalMoneySaved-priceOfWashingMachine));}
    }
}
