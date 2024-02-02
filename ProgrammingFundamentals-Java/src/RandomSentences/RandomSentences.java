package RandomSentences;

import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names =    {"Peter", "Michell", "Jane", "Steve", };
        String[] places =   {"Sofia", "Plovdiv", "Varna", "Burgas", "Plovdiv", "Sofia", "Belgrade",
                "Bratislava", "Bucharest", "Budapest", "Kiev", "Krakow", "Ljubljana", "Moscow", "Prague",
                "Tallinn", "Warsaw", "Zagreb", "Athens", "Vilnius", "Riga", "Dubrovnik", "Sarajevo", "Skopje",
                "Tirana", "Podgorica", "Chisinau", "Minsk", "Yerevan", "Baku", "Tbilisi", "Ankara", "Istanbul",
                "Nicosia", "Thessaloniki", "Split", "Rijeka", "Wroclaw", "Gdansk", "Poznan", "Lodz", "Lviv",
                "Odessa", "Kharkiv", "Cluj-Napoca", "Timisoara", "Iasi", "Brno", "Ostrava", "Plzen", "Brasov",
                "Sibiu", "Constanta", "Varna", "Burgas", "Ruse", "Nis", "Novi Sad", "Banja Luka", "Mostar",
                "Bitola", "Ohrid", "Durres", "Shkoder", "Kotor", "Bar", "Balti", "Tiraspol", "Brest", "Grodno",
                "Gomel", "Vanadzor", "Gyumri", "Ganja", "Sumqayit", "Batumi", "Kutaisi", "Samsun", "Izmir",
                "Bursa", "Antalya", "Adana", "Konya", "Ankara", "Limassol", "Larnaca", "Paphos", "Heraklion",
                "Patras", "Volos", "Larissa", "Kaunas", "Klaipeda", "Siauliai", "Panevezys", "Daugavpils",
                "Liepaja", "Jelgava", "Jurmala", "Parnu", "Tartu", "Narva", "Kohtla-Jarve"};
        String[] verbs =    {"eats", "holds", "sees", "plays with", "brings", };
        String[] nouns =    {"stones", "cake", "apple", "laptop", "bikes", };
        String[] adverbs =  {"slowly", "diligently", "warmly", "sadly", "rapidly", };
        String[] details =  {"near the river", "at home", "in the park", };

        while (true) {
            System.out.println("Hello, if you'd like to generate a random sentence,\npress [Y]es,\npress [N]o if you'd like to exit!\n");
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("y")) {
                System.out.println("\t...-=Generating-Random-Sentence=-...");
            } else if (input.toLowerCase().equals("n")) {
                System.out.println("Exiting!");
                break;
            } else {
                System.out.println("Input invalid. Try again");
                continue;
            }
            System.out.printf("%s from %s %s %s %s %s. \n\n",
                    getRandomWord(names),
                    getRandomWord(places),
                    getRandomWord(verbs),
                    getRandomWord(nouns),
                    getRandomWord(adverbs),
                    getRandomWord(details)  );
        }
    }

    public static String getRandomWord (String[] words) {
        Random random = new Random();

        int randomIdx = random.nextInt(words.length);

        return words[randomIdx];
    }
}
