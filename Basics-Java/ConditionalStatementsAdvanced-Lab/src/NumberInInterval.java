import java.util.Scanner;

public class NumberInInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        String openOrClosed = "";
        boolean isWorking = (hour >= 10 && hour <= 18);


        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                openOrClosed = "open";
                break;
            case "Sunday":
                openOrClosed = "closed";
                break;
            default:
                System.out.println("error");
                break;
        }
        if (isWorking) {
            System.out.println(openOrClosed);
        }
        else {
            System.out.println("closed");
        }
    }
}
