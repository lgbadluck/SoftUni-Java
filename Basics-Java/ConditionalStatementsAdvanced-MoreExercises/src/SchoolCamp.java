import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        String sportType = "";
        int numParticipants = Integer.parseInt(scanner.nextLine());
        int numNightStayed = Integer.parseInt(scanner.nextLine());
        double totalPriceForVacation = 0;

        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "boys":
                        totalPriceForVacation = numParticipants*numNightStayed*9.60;
                        sportType = "Judo";
                        break;
                    case "girls":
                        totalPriceForVacation = numParticipants*numNightStayed*9.60;
                        sportType = "Gymnastics";
                        break;
                    case "mixed":
                        totalPriceForVacation = numParticipants*numNightStayed*10.0;
                        sportType = "Ski";
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "boys":
                        totalPriceForVacation = numParticipants*numNightStayed*7.20;
                        sportType = "Tennis";
                        break;
                    case "girls":
                        totalPriceForVacation = numParticipants*numNightStayed*7.20;
                        sportType = "Athletics";
                        break;
                    case "mixed":
                        totalPriceForVacation = numParticipants*numNightStayed*9.50;
                        sportType = "Cycling";
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Summer":
            switch (groupType) {
                case "boys":
                    totalPriceForVacation = numParticipants*numNightStayed*15.0;
                    sportType = "Football";
                    break;
                case "girls":
                    totalPriceForVacation = numParticipants*numNightStayed*15.0;
                    sportType = "Volleyball";
                    break;
                case "mixed":
                    totalPriceForVacation = numParticipants*numNightStayed*20.0;
                    sportType = "Swimming";
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            break;
            default:
                System.out.println("error");
                break;
        }

        if (numParticipants>=50) {
            totalPriceForVacation-=totalPriceForVacation*0.50;
        } else if (numParticipants >=20) {
            totalPriceForVacation-=totalPriceForVacation*0.15;
        } else if (numParticipants >=10) {
            totalPriceForVacation-=totalPriceForVacation*0.05;
        }

        System.out.printf("%s %.2f lv.\n", sportType, totalPriceForVacation);

    }
}
