package FinalsExam_31_03_24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(\\|)(?<boss>[A-Z]{4,})\\1:(#)(?<title>[A-Za-z]+\\s{1}[A-Za-z]+)\\3";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        int n = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            String text = scanner.nextLine();
            matcher = pattern.matcher(text);

            if(matcher.find()) {
                String boss = matcher.group("boss");
                String title = matcher.group("title");
                int strength = boss.length();
                int armor = title.length();
                System.out.println(boss + ", The " + title + "\n>> Strength: " + strength + "\n>> Armor: " + armor);
            } else {
                System.out.println("Access denied!");
            }
            n--;
        }
    }
}
