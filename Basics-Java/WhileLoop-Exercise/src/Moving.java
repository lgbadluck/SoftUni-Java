import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthFreeSpace  = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace  = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace  = Integer.parseInt(scanner.nextLine());
        int volumeFreeSpace = widthFreeSpace*lengthFreeSpace*heightFreeSpace;
        String inputText;
        int numBoxes;

        while (volumeFreeSpace > 0) {
            inputText = scanner.nextLine();
            if (inputText.equals("Done")) {
                System.out.printf("%d Cubic meters left.\n", volumeFreeSpace);
                break;
            }
            numBoxes = Integer.parseInt(inputText);
            volumeFreeSpace -= numBoxes;
        }

        if (volumeFreeSpace<=0 ) System.out.printf("No more free space! You need %d Cubic meters more.\n", Math.abs(volumeFreeSpace));
    }
}
