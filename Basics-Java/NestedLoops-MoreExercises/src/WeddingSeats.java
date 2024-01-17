import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.next();
        char lastSectorLetter = inputText.charAt(0);
        int numSeatsInSectorA = Integer.parseInt(scanner.next());
        int numSeatInOddRow = Integer.parseInt(scanner.next());
        int totalSeats = 0;

        for (char pos1 = 'A'; pos1 <= lastSectorLetter; pos1++) {
            for (int pos2=1; pos2<=numSeatsInSectorA; pos2++) {
                int additionSeatsForEvenRow = 0;
                if (pos2%2==0) additionSeatsForEvenRow = 2;
                else additionSeatsForEvenRow = 0;
                for (int pos3=0; pos3<numSeatInOddRow+additionSeatsForEvenRow; pos3++) {
                    System.out.printf("%c%d%c \n", pos1, pos2, (pos3)+'a');
                    totalSeats++;
                }
            }
            numSeatsInSectorA++;
        }
        System.out.println(totalSeats);
    }
}
