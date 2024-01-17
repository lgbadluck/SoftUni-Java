import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesNum = Integer.parseInt(scanner.nextLine());
        int perHourRead = Integer.parseInt(scanner.nextLine());
        int timeToRead = Integer.parseInt(scanner.nextLine());

        int hourPerDay = (pagesNum/perHourRead) / timeToRead;

        System.out.printf("%d\n", hourPerDay);
    }
}
