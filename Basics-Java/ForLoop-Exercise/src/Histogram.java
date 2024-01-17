import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1, p2, p3, p4, p5;
        double countP1, countP2, countP3, countP4, countP5;
        p1=p2=p3=p4=p5=0.0;
        countP1=countP2=countP3=countP4=countP5=0.0;

        for (int i=1; i<=n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= 199) {
                countP1++;
            } else if (number <= 399) {
                countP2++;
            } else if (number <= 599) {
                countP3++;
            } else if (number <= 799) {
                countP4++;
            } else if (number >= 800) {
                countP5++;
            }
        }

        p1 = (countP1 / (double)n) * 100.0;
        p2 = (countP2 / (double)n) * 100.0;
        p3 = (countP3 / (double)n) * 100.0;
        p4 = (countP4 / (double)n) * 100.0;
        p5 = (countP5 / (double)n) * 100.0;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n", p1,p2,p3,p4,p5);
    }
}
