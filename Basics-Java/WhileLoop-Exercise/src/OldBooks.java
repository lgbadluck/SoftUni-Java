import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookToFind = scanner.nextLine();
        int checks = 0;
        String inputText = scanner.nextLine();

        while ( !inputText.equals("No More Books") ) {

            if (inputText.equals(bookToFind)) {
                System.out.printf("You checked %d books and found it.\n", checks);
                break;
            }
            checks++;
            inputText = scanner.nextLine();
        }
        if (inputText.equals("No More Books")) {
            System.out.printf("The book you search is not here!\nYou checked %d books.\n", checks);
        }
    }
}
