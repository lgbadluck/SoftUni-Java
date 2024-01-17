import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        while(!inputText.equals("Stop")){
            System.out.printf("%s\n", inputText);
            inputText = scanner.nextLine();
        }

    }

}
