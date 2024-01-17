import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //float changeToReturn = Float.parseFloat(scanner.nextLine());
        int numCoinsToReturn = 0;

        String input = scanner.nextLine();
        int len = input.length();
        char[] charArray;
        charArray = input.toCharArray();
        StringBuilder leva = new StringBuilder();
        StringBuilder stotinki = new StringBuilder();

        for (int i=0; i<len; i++) {
            if (charArray[i]=='.') {
                leva.append(stotinki);
                stotinki = new StringBuilder("");
                continue;
            }
            stotinki.append(charArray[i]);
        }

        String levaString = new String(leva);
        String stotinkiString = new String(stotinki);

        int whole;
        if (levaString.isEmpty()) {
            whole = 0;
        } else whole = Integer.parseInt( levaString );
        int rest;
        if (stotinkiString.isEmpty()) {
            rest = 0;
        } else rest = Integer.parseInt( stotinkiString );

        while (whole>=2) {
            whole-=2;
            numCoinsToReturn++;
        }

        while (whole>=1) {
            whole-=1;
            numCoinsToReturn++;
        }

        while (rest>=50) {
            rest-=50;
            numCoinsToReturn++;
        }

        while (rest>=20) {
            rest-=20;
            numCoinsToReturn++;
        }

        while (rest>=10) {
            rest-=10;
            numCoinsToReturn++;
        }

        while (rest>=5) {
            rest-=5;
            numCoinsToReturn++;
        }

        while (rest>=2) {
            rest-=2;
            numCoinsToReturn++;
        }

        while (rest>=1) {
            rest-=1;
            numCoinsToReturn++;
        }

        System.out.println(numCoinsToReturn);
    }
}
