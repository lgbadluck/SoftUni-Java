import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthInCm = Integer.parseInt(scanner.nextLine());
        int lengthInCm = Integer.parseInt(scanner.nextLine());
        String inputText;
        int sumAllCake = lengthInCm*widthInCm;
        int numCakes;

        while (sumAllCake>0) {
            inputText = scanner.nextLine();
            if(inputText.equals("STOP")) {
                System.out.printf("%d pieces are left.\n", sumAllCake);
                break;
            }
            numCakes = Integer.parseInt(inputText);
            sumAllCake-=numCakes;
        }

        if (sumAllCake <= 0 )System.out.printf("No more cake left! You need %d pieces more.\n", Math.abs(sumAllCake));
    }
}
