import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double R = Double.parseDouble(scanner.nextLine());

        //Area of a circle using radius
        //A = πr^2
        System.out.printf("%.2f\n", Math.PI*R*R);
        //Circumference formula using radius
        //C = 2πr
        System.out.printf("%.2f\n", 2*Math.PI*R);
    }
}
