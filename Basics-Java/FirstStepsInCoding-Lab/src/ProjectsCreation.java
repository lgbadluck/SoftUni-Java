import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String archName = scanner.nextLine();
        int numProj = Integer.parseInt(scanner.nextLine());
        int totalHours = numProj * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.\n", archName, totalHours, numProj);
    }
}
