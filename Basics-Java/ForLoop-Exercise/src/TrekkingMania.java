import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());
        int totalClimbers = 0;
        int numClimbersPeak1 = 0;
        int numClimbersPeak2 = 0;
        int numClimbersPeak3 = 0;
        int numClimbersPeak4 = 0;
        int numClimbersPeak5 = 0;
        double proPeak1 = 0.0;
        double proPeak2 = 0.0;
        double proPeak3 = 0.0;
        double proPeak4 = 0.0;
        double proPeak5 = 0.0;

        for (int i=1; i<=numberOfGroups; i++){
            int tempNumberOfClimbers = Integer.parseInt(scanner.nextLine());
            totalClimbers += tempNumberOfClimbers;
            if (tempNumberOfClimbers<6) {
                numClimbersPeak1 += tempNumberOfClimbers;
            } else if (tempNumberOfClimbers < 13) {
                numClimbersPeak2 += tempNumberOfClimbers;
            } else if (tempNumberOfClimbers < 26) {
                numClimbersPeak3 += tempNumberOfClimbers;
            } else if (tempNumberOfClimbers < 41) {
                numClimbersPeak4 += tempNumberOfClimbers;
            } else numClimbersPeak5 += tempNumberOfClimbers;
        }
        proPeak1 = ( (double) numClimbersPeak1/ (double) totalClimbers) * 100.0;
        proPeak2 = ( (double) numClimbersPeak2/ (double) totalClimbers) * 100.0;
        proPeak3 = ( (double) numClimbersPeak3/ (double) totalClimbers) * 100.0;
        proPeak4 = ( (double) numClimbersPeak4/ (double) totalClimbers) * 100.0;
        proPeak5 = ( (double) numClimbersPeak5/ (double) totalClimbers) * 100.0;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n", proPeak1,proPeak2,proPeak3,proPeak4,proPeak5);
    }
}
