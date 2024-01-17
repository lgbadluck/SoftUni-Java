import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат четири реда:
        //•	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
        //•	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        //•	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
        //•	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        //Да се отпечата на конзолата едно от двете възможни състояния:
        //•	До колко се е запълнил басейна и коя тръба с колко процента е допринесла.
        //o	"The pool is {запълненост на басейна в проценти}% full. Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%."
        //Aко басейнът се е препълнил – с колко литра е прелял за даденото време.
        //o	"For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."


        double p1FilledHours = P1*H;
        double p2FilledHours = P2*H;
        double poolFilledHours = p1FilledHours + p2FilledHours;
        double p1ProcFill, p2ProcFill, poolProcFill;

        p1ProcFill = (p1FilledHours / poolFilledHours) * 100.0;
        p2ProcFill = (p2FilledHours / poolFilledHours) * 100.0;
        poolProcFill = (poolFilledHours / V) * 100.0;

        if (V >= poolFilledHours) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.\n", poolProcFill, p1ProcFill, p2ProcFill);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.\n", H, Math.abs(V-poolFilledHours));
        }
    }
}
