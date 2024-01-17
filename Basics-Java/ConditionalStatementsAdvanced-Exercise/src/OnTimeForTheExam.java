import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // INPUTS
        //Първият ред съдържа час на изпита – цяло число от 0 до 23.
        //Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
        //Третият ред съдържа час на пристигане – цяло число от 0 до 23.
        //Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
        int hourOfExams = Integer.parseInt(scanner.nextLine());
        int minuteOfExams = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());

        int minTotalArrive = hourOfArrival*60 + minuteOfArrival;
        int minTotalExam = hourOfExams*60 + minuteOfExams;
        int deltaMinutes = minTotalExam - minTotalArrive;

        if (deltaMinutes == 0) {
            System.out.println("On time");
        } else if ( deltaMinutes < 0 ) {
            System.out.println("Late");
            if ( Math.abs(deltaMinutes) < 60) {
                System.out.printf("%d minutes after the start\n", Math.abs(deltaMinutes));
            } else {
                System.out.printf("%d:%02d hours after the start\n", Math.abs(deltaMinutes/60), Math.abs(deltaMinutes%60));
            }
        } else if ( deltaMinutes > 0 &&  deltaMinutes <= 30) {
            System.out.println("On time");
            if ( Math.abs(deltaMinutes) < 60) {
                System.out.printf("%d minutes before the start\n", deltaMinutes);
            } else {
                System.out.printf("%d:%02d hours before the start\n", (deltaMinutes/60), (deltaMinutes%60));
            }
        } else if ( deltaMinutes > 30) {
            System.out.println("Early");
            if ( deltaMinutes < 60) {
                System.out.printf("%d minutes before the start\n", deltaMinutes);
            } else {
                System.out.printf("%d:%02d hours before the start\n", (deltaMinutes/60), (deltaMinutes%60));
            }
        }
        // OUTPUTS
        //“Late”, ако студентът пристига по-късно от часа на изпита.
        //“On time”, ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
        //“Early”, ако студентът пристига повече от 30 минути преди часа на изпита.
        //Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
    }
}
