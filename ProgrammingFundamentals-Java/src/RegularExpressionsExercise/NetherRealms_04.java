package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] demonNames = scanner.nextLine().split("\\s*,\\s*");
        String regex = "[-]?\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(regex);

        for (String name :demonNames) {
            Matcher matcher = pattern.matcher(name);
            char[] nameCharArr = name.toCharArray();
            int health = 0;
            double damage = 0;
            int countMultiply = 0;
            int countDivide = 0;
            for (char c : nameCharArr) {
                if((c < '0' || c > '9') && (c != '+' && c != '-' && c != '*' && c != '/' && c != '.')) {
                    health+= c;
                } else {
                    if(c == '*') {
                        countMultiply++;
                    }
                    if(c == '/') {
                        countDivide++;
                    }
                }
            }
            while(matcher.find()) {
                damage += Double.parseDouble(matcher.group());
            }
            //System.out.println("damage: " + damage);
            //System.out.println("countMultiply: " + countMultiply);
            //System.out.println("countDivide: " + countDivide);

            for (int i = 0; i < countMultiply; i++) {
                damage *= 2;
            }
            for (int i = 0; i < countDivide; i++) {
                damage /= 2;
            }

            System.out.printf("%s - %d health, %.2f damage\n", name, health, damage);
        }
    }
}
