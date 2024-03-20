package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\_\\.+(?<pass>[A-Z][A-Za-z0-9]{4,}[A-Z])\\_\\.+";
        String regexGroup = "\\d+";

        int n = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            String group = "";
            if (matcher.find()) {
                String passMatch = matcher.group("pass");
                Pattern patternGroup = Pattern.compile(regexGroup);
                Matcher matcherGroup = patternGroup.matcher(passMatch);
                while (matcherGroup.find()) {
                    group += matcherGroup.group();
                }
                if(group.equals("")) {
                    group = "default";
                }

                System.out.println("Group: " + group);
            }
            else {
                System.out.println("Invalid pass!");
            }

            n--;
        }
    }
}
