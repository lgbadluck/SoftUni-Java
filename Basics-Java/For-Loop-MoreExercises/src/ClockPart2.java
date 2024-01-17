import java.util.Scanner;

public class ClockPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int hr=0; hr<=23; hr++) {
            for (int min=0; min<=59; min++) {
                for (int sec=0; sec<=59; sec++) {
                    System.out.printf("%d : %d : %d\n", hr, min, sec);
                }
            }
        }
    }
}
