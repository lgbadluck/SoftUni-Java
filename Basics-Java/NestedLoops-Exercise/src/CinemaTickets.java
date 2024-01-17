import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAttendanceCounter = 0;
        double numKidTickets = 0;
        double numStandardTickets = 0;
        double numStudentTickets = 0;
        String inputText = scanner.nextLine();

        while (!inputText.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int seatsTakenUpCounter = 0;
            do {
                String typeTicket = scanner.nextLine();
                if (typeTicket.equals("End")) {
                    break;
                }
                totalAttendanceCounter++;
                switch (typeTicket) {
                    case "kid":
                        numKidTickets++;
                        break;
                    case "standard":
                        numStandardTickets++;
                        break;
                    case "student":
                        numStudentTickets++;
                        break;
                    default:
                        break;
                }
                seatsTakenUpCounter++;
            } while (freeSeats > seatsTakenUpCounter);
            System.out.printf("%s - %.2f%% full.\n", inputText, ((double) seatsTakenUpCounter / (double) freeSeats)*100.0);
            inputText = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", totalAttendanceCounter);
        System.out.printf("%.2f%% student tickets.\n%.2f%% standard tickets.\n%.2f%% kids tickets.\n",
                (numStudentTickets / totalAttendanceCounter)*100.0, (numStandardTickets / totalAttendanceCounter)*100.0, (numKidTickets / totalAttendanceCounter)*100.0);

    }
}
