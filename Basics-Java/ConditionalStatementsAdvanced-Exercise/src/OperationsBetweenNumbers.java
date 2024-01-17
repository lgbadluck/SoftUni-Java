import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Inputs
        //N1 – цяло число в интервала [0...40 000]
        //N2 – цяло число в интервала [0...40 000]
        //Оператор – един символ измеду: „+“, „-“, „*“, „/“, „%“
        int numberA = Integer.parseInt(scanner.nextLine());
        int numberB = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        String parity = "";

        switch (operator) {
            case "+":
                if ( (numberA + numberB) %2 == 0) {
                    parity = "even";
                } else {
                    parity = "odd";
                }
                System.out.printf("%d %s %d = %d - %s\n",
                        numberA, operator, numberB, (numberA + numberB), parity);
                break;
            case "-":
                if ( (numberA - numberB) %2 == 0) {
                    parity = "even";
                } else {
                    parity = "odd";
                }
                System.out.printf("%d %s %d = %d - %s\n",
                        numberA, operator, numberB, (numberA - numberB), parity);
                break;
            case "*":
                if ( (numberA * numberB) %2 == 0) {
                    parity = "even";
                } else {
                    parity = "odd";
                }
                System.out.printf("%d %s %d = %d - %s\n",
                        numberA, operator, numberB, (numberA * numberB), parity);
                break;
            case "/":
                if (numberB == 0) {
                    System.out.printf("Cannot divide %d by zero\n", numberA);
                } else {
                    System.out.printf("%d %s %d = %.2f\n",
                            numberA, operator, numberB, ((double) numberA / (double) numberB));
                }
                break;
            case "%":
                if (numberB == 0) {
                    System.out.printf("Cannot divide %d by zero\n", numberA);
                } else {
                    System.out.printf("%d %s %d = %d\n",
                            numberA, operator, numberB, (numberA % numberB));
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        // Outputs
        //Ако операцията е събиране, изваждене или умножение:
        // „{N1} {оператор} {N2} = {резултат} – {even/odd}“
        //Ако операцията е деление:
        //„{N1} / {N2} = {резултат}“ – резултатът е фораматиран до вторият знак след дес.запетая
        //Ако операцията е модулно деление:
        //„{N1} % {N2} = {остатък}“
        //В случай на деление с 0(нула):
        //„Cannot divide {N1} by zero“
    }
}
