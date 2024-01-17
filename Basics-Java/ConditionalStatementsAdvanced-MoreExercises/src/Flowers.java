import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFlowers1 = Integer.parseInt(scanner.nextLine());
        int numFlowers2 = Integer.parseInt(scanner.nextLine());
        int numFlowers3 = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();
        double priceForAll = 0;

        switch (season) {
            case "Spring":
                if ( isHoliday.equals("Y") ) {
                    priceForAll = numFlowers1*2.0 + numFlowers2*4.10 + numFlowers3*2.50;
                    priceForAll+= priceForAll*0.15;
                } else priceForAll = numFlowers1*2.0 + numFlowers2*4.10 + numFlowers3*2.50;
                if (numFlowers3>7) priceForAll-=priceForAll*0.05;

                break;
            case "Summer":
                if ( isHoliday.equals("Y") ) {
                    priceForAll = numFlowers1*2.0 + numFlowers2*4.10 + numFlowers3*2.50;
                    priceForAll+= priceForAll*0.15;
                } else priceForAll = numFlowers1*2.0 + numFlowers2*4.10 + numFlowers3*2.50;
                break;
            case "Autumn":
                if ( isHoliday.equals("Y") ) {
                    priceForAll = numFlowers1*3.75 + numFlowers2*4.50 + numFlowers3*4.15;
                    priceForAll+= priceForAll*0.15;
                } else priceForAll = numFlowers1*3.75 + numFlowers2*4.50 + numFlowers3*4.15;
                break;
            case "Winter":
                if ( isHoliday.equals("Y") ) {
                    priceForAll = numFlowers1*3.75 + numFlowers2*4.50 + numFlowers3*4.15;
                    priceForAll+= priceForAll*0.15;
                } else priceForAll = numFlowers1*3.75 + numFlowers2*4.50 + numFlowers3*4.15;
                if (numFlowers2 >= 10) priceForAll-=priceForAll*0.10;
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        if (numFlowers1+numFlowers2+numFlowers3 > 20) {
            priceForAll-=priceForAll*0.20;
        }

        //Add 2 BGN for arranging all the flowers
        priceForAll+=2;

        System.out.printf("%.2f\n", priceForAll);
    }
}
