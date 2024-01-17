import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Градусите - цяло число в интервала [10…42]
        //Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"
        int degreesC = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        String outfit = "not selected";
        String shoes = "not selected";

        switch (timeOfDay) {
            case "Morning":
                if (degreesC >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degreesC <= 24 && degreesC > 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degreesC <= 18 && degreesC >= 10) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }
                break;
            case "Afternoon":
                if (degreesC >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                } else if (degreesC <= 24 && degreesC > 18) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degreesC <= 18 && degreesC >= 10) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
            case "Evening":
                if (degreesC >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degreesC <= 24 && degreesC > 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degreesC <= 18 && degreesC >= 10) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
            default:
                System.out.println("error");
                break;
        }


        if ( !(outfit.equals("not selected")) ) {
            System.out.printf("It's %d degrees, get your %s and %s.\n",
                    degreesC, outfit, shoes);
        }
    }
}
