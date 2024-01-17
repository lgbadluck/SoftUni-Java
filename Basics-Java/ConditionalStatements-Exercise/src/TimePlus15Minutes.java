import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        //int totalTimeMinutes = hours*60 + minutes +15;

        if (minutes + 15 >= 60) {
            System.out.printf("%01d:%02d", ((hours+1)%24), ((minutes+15)-60) );
        } else {
            System.out.printf("%01d:%02d", (hours%24), (minutes+15) );
        }

    }
}
