import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        // One working space WxL: 70x120cm (70x40cm - Table&Chair; 70x80cm - Moving space)
        // Corridor Width at least 100cm
        // GateIngres (160cm) takes up at least 1 Working space (70x120cm)
        // TeachersPodium takes up at least 2 working spaces (160x120cm)

        int rows, cols;

        rows = (int) ((w - 1) / 0.70); // Take out 100cm (1m) from the width
        cols = (int) (l  / 1.20);
        // Number of Workspaces = Row X Cols - 3 (for Gate and Podium)
        System.out.printf("%d", (rows*cols)-3 );
    }
}
