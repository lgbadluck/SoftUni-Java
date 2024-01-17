import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // INPUTS:
        //От конзолата първо се четат два реда:
        //Брой турнири, в които е участвал – цяло число в интервала [1…20]
        //Начален брой точки в ранглистата - цяло число в интервала [1...4000]
        //За всеки турнир се прочита отделен ред:
        //Достигнат етап от турнира – текст – "W", "F" или "SF"
        int numTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        double procTournamentWins = 0.0;
        int averagePointsPerGame = 0;
        int totalPoints = 0;
        int numTournametWon = 0;

        totalPoints = startingPoints;
        for (int i=1; i<=numTournaments; i++) {
            String resultWFSF = scanner.nextLine();
            switch (resultWFSF) {
                case "W":
                    totalPoints += 2000;
                    numTournametWon++;
                break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
                default:
                    System.out.println("Invalid!\n");
                    break;
            }

        }
        averagePointsPerGame = (totalPoints - startingPoints) / numTournaments;
        procTournamentWins = ( (double) numTournametWon / (double) numTournaments ) * 100.0;
        System.out.printf("Final points: %d\nAverage points: %d\n%.2f%%\n", totalPoints, averagePointsPerGame, procTournamentWins);
    }
}
