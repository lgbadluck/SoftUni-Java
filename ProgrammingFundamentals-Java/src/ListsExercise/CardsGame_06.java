package ListsExercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Queue<Integer> player1 = new LinkedList<>();
        Queue<Integer> player2 = new LinkedList<>();

        String[] player1Cards = scanner.nextLine().split(" ");
        String[] player2Cards = scanner.nextLine().split(" ");

        for (String card : player1Cards) {
            player1.add(Integer.parseInt(card));
        }
        for (String card : player2Cards) {
            player2.add(Integer.parseInt(card));
        }

        //System.out.println(player1.toString().replaceAll("[\\[\\],]", ""));
        //System.out.println(player2.toString().replaceAll("[\\[\\],]", ""));

        while (!player1.isEmpty() && !player2.isEmpty()) {
            int movePlayer1 = player1.poll();
            int movePlayer2 = player2.poll();

            if (!(movePlayer1 == movePlayer2)) {
                if (movePlayer1 > movePlayer2) {
                    player1.add(movePlayer1);
                    player1.add(movePlayer2);
                } else {
                    player2.add(movePlayer2);
                    player2.add(movePlayer1);
                }
            }
        }

        int sum = 0;
        if (player1.isEmpty()) {
            int len = player2.size();
            for (int i = 0; i < len; i++) {
                sum += player2.poll();
            }
            System.out.println("Second player wins! Sum: " + sum);
        } else {
            int len = player1.size();
            for (int i = 0; i < len; i++) {
                sum += player1.poll();
            }
            System.out.println("First player wins! Sum: " + sum);

        }

    }
}
