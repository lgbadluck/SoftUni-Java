package RandomSentences;

import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names =    {"Peter", "Michell", "Jane", "Steve", "Oliver", "Charlotte", "Declan",
                "Aurora", "Theodore", "Violet", "Jasper", "Hazel", "Silas", "Luna", "Liam", "Amelia",
                "Asher", "Aria", "Finn", "Ava", "Owen", "Scarlett", "Ethan", "Isla", "Alexander", "Ivy",
                "Felix", "Freya", "Henry", "Nora", "Gabriel", "Evelyn", "Elijah", "Olivia", "Leo", "Audrey",
                "Noah", "Iris", "August", "Eleanor", "Levi", "Abigail", "Sebastian", "Adelaide", "Benjamin",
                "Penelope", "Atticus", "Rose", "Archer", "Sophia", "Grayson", "Chloe", "Milo", "Lydia",
                "Emmett", "Emma", "Isaac", "Anastasia", "Jack", "Eloise", "Everett", "Grace", "William",
                "Genevieve", "Atlas", "Ruby", "Arthur", "Sophie", "Theo", "Clara", "Ronan", "Adeline",
                "Samuel", "Athena", "Caleb", "Mia", "Aiden", "Vivienne", "Miles", "Daphne", "Elliott",
                "Maya", "Landon", "Vivian", "Axel", "Eliza", "Arlo", "Ella", "Elias", "Arabella", "Eli",
                "Mila", "Andrew", "Stella", "Callum", "Juniper", "Xander", "Esme"};
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
        String[] verbs =    {"eats", "holds", "sees", "plays with", "brings", "speaks", "plays",
                "gives", "makes", "knows", "thinks", "takes", "sees", "comes", "wants", "looks",
                "finds", "tells", "works", "calls", "tries", "asks", "needs", "feels", "becomes",
                "leaves", "puts", "means", "keeps", "lets", "begins", "seems", "helps", "talks",
                "turns", "starts", "shows", "hears", "runs", "moves", "likes", "lives", "believes",
                "holds", "brings", "happens", "writes", "provides", "sits", "stands", "loses", "pays",
                "meets", "includes", "continues", "sets", "learns", "changes", "leads", "understands",
                "watches", "follows", "reads", "teaches", "studies", "goes", "does", "has", "is", "says",
                "gets", "would", "can", "will", "should", "may", "might", "must", "drives", "eats",
                "drinks", "sleeps", "dreams", "smiles", "laughs", "cries", "sings", "dances", "jumps",
                "walks", "swims", "flies", "draws", "paints", "builds", "breaks", "fixes", "buys",
                "sells", "borrows", "lends", "sends", "receives", "shares", "invites", "accepts",
                "rejects", "agrees", "disagrees", "likes", "dislikes", "loves", "hates"};
        String[] nouns =    {"stones", "cake", "apple", "laptop", "bikes", "time", "year", "people",
                "way", "day", "man", "thing", "woman", "life", "child", "world", "school", "state",
                "family", "student", "group", "country", "problem", "hand", "part", "place", "case",
                "week", "company", "system", "program", "question", "work", "government", "number",
                "night", "point", "home", "water", "room", "mother", "area", "money", "story", "fact",
                "month", "lot", "right", "study", "book", "eye", "job", "word", "business", "issue",
                "side", "kind", "head", "house", "service", "friend", "father", "power", "hour", "game",
                "line", "end", "member", "law", "car", "city", "community", "name", "president", "team",
                "minute", "idea", "kid", "body", "information", "back", "parent", "face", "others",
                "level", "office", "door", "health", "person", "art", "war", "history", "party",
                "result", "change", "morning", "reason", "research", "girl", "guy", "moment",
                "air", "teacher", "force", "education"};
        String[] adverbs =  {"slowly", "diligently", "warmly", "sadly", "rapidly", "quickly", "slowly",
                "carefully", "badly", "well", "easily", "hardly", "nicely", "loudly", "quietly",
                "happily", "sadly", "angrily", "calmly", "early", "late", "soon", "never", "always",
                "sometimes", "often", "rarely", "usually", "really", "very", "too", "so", "quite",
                "enough", "almost", "nearly", "completely", "totally", "absolutely", "extremely",
                "rather", "fairly", "slightly", "mostly", "partly", "fully", "here", "there",
                "everywhere", "nowhere", "anywhere", "somewhere", "inside", "outside", "upstairs",
                "downstairs", "above", "below", "near", "far", "ahead", "behind", "back", "forward",
                "home", "away", "today", "tomorrow", "yesterday", "tonight", "now", "then", "later",
                "earlier", "recently", "previously", "already", "still", "yet", "again", "also", "too",
                "only", "just", "even", "however", "therefore", "thus", "otherwise", "instead", "finally",
                "eventually", "actually", "probably", "maybe", "perhaps", "possibly", "certainly", "surely",
                "clearly", "obviously", "especially", "particularly", "mainly", "mostly"};
        String[] details =  {"near the river", "at home", "in the park", "near the river", "at home",
                "in the park", "on the beach", "in the forest", "at the mall", "in the office",
                "on the farm", "in the desert", "on the mountain", "in the city", "in the country",
                "at the airport", "in the museum", "on the island", "in the lake", "in the garden",
                "at the zoo", "in the library", "on the bridge", "in the hotel", "at the restaurant",
                "in the school", "at the stadium", "in the church", "on the train", "in the car",
                "on the bike", "in the pool", "at the gym", "in the hospital", "at the cinema",
                "in the theater", "on the stage", "in the kitchen", "in the bedroom", "in the bathroom",
                "in the living room", "on the couch", "in the closet", "in the basement", "in the attic",
                "on the roof", "in the garage", "in the barn", "in the tent", "on the boat", "in the plane",
                "in the helicopter", "in the submarine", "in the spaceship", "on the moon", "in the castle",
                "in the dungeon", "in the cave", "in the volcano", "in the waterfall", "in the rainbow",
                "in the cloud", "in the sky", "in the sun", "in the snow", "in the rain", "in the storm",
                "in the wind", "in the fog", "in the dark", "in the light", "in the fire", "in the ice",
                "in the dream", "in the nightmare", "in the book", "in the movie", "in the game",
                "in the song", "in the picture", "in the mirror", "in the glass", "in the bottle",
                "in the box", "in the bag", "in the pocket", "in the wallet", "in the card",
                "in the letter", "in the email", "in the message", "in the chat", "in the voice",
                "in the silence", "in the noise", "in the music", "in the sound", "in the word",
                "in the sentence", "in the question", "in the answer"};

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
