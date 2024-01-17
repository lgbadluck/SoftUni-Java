import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlValue = Integer.parseInt(scanner.nextLine());
        //„Парола ще получиш, ако знаеш  едно цяло число, контролна стойност  се нарича то,
        //почива в интервала от 4 до 144 включително, но да го откриеш може би ще е мъчително. ”
        //Паролата има формат: "abcd" и контролната стойност трябва да е равна на  a*b + c*d , но трябва да бъдат спазени следните условия:
        //при намирането на а и b: a < b
        //при намиране на  c и d: c > d
        //a, b, c и d са числа в интервала [1 - 9]

        int counter=0;
        StringBuilder passwordBuilder = null;
        String password = "";
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (!(a < b)) continue;
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (!(c > d)) continue;
                        if ( ((a * b) + (c * d)) == controlValue ) {
                            counter++;
                            System.out.printf(" %d%d%d%d", a,b,c,d);
                            if (counter==4) {
                                passwordBuilder = new StringBuilder();
                                passwordBuilder.append(a);
                                passwordBuilder.append(b);
                                passwordBuilder.append(c);
                                passwordBuilder.append(d);
                                password= passwordBuilder.toString();
                            }
                        }
                    }
                }
            }
        }
        //Ако съществува четвърта четворка се отпечатва: „Password: {а}{b}{c}{d}“
        //Ако НЕ са намерени такива числа или няма  четвърта четворка отпечатваме: “No!”
        if (!password.equals("")) {
            System.out.printf("\nPassword: %s\n", password);
        } else System.out.printf("\nNo!\n");
    }
}
