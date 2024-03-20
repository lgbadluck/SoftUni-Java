package RegularExpressionsExercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planet>[A-Z][a-z]+)[^@!:>-]*:(?<population>[0-9*]+)[^@!:>-]*!(?<attackOrDestruction>[AD])![^@!:>-]*->(?<soildierCount>[0-9*]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanets = new LinkedList<>();
        List<String> destroyedPlanets = new LinkedList<>();
        while (n > 0) {
            String encrypted = scanner.nextLine();
            StringBuilder decrypted = new StringBuilder();
            int key = 0;
            for (char c : encrypted.toLowerCase().toCharArray()) {
                if (c == 's' || c == 't' || c == 'a' || c == 'r') {
                    key++;
                }
            }
            for (char c : encrypted.toCharArray()) {
                decrypted.append((char) (c-key));
            }
            //System.out.println("encrypted: " + encrypted);
            //System.out.println("key: " + key);
            //System.out.println("decrypted: " + decrypted);
            Matcher matcher = pattern.matcher(decrypted);

            if(matcher.find()) {
                String planet = matcher.group("planet");
                String attackType = matcher.group("attackOrDestruction");
                if(attackType.equals("A")) {
                    attackedPlanets.add(planet);
                }
                if(attackType.equals("D")) {
                   destroyedPlanets.add(planet);
                }
            }

            n--;
        }

        System.out.println("Attacked planets: " + attackedPlanets.size());
        attackedPlanets.stream().sorted().forEach(p -> System.out.printf("-> %s\n", p));
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        destroyedPlanets.stream().sorted().forEach(p -> System.out.printf("-> %s\n", p));
    }

}
