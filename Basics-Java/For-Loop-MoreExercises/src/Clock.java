import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int hr=0; hr<=23; hr++) {
            for (int min=0; min<=59; min++) {
                System.out.printf("%d : %d\n", hr, min);
            }
        }
    }
}
