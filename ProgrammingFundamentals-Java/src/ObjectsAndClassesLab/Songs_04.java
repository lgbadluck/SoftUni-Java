package ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new LinkedList<Song>();

        while (n > 0) {
            String[] input = scanner.nextLine().split("_");
            //System.out.println(input[0] + input[1] + input[2]);
            Song newSong = new Song(input[0], input[1], input[2]);
            songsList.add(newSong);
            n--;
        }

        String typeList = scanner.nextLine();

        if (typeList.equals("all")) {
            for (Song thisSong : songsList) {
                System.out.println(thisSong.getName());
            }
        } else {
            for (Song thisSong : songsList) {
                if (thisSong.getTypeList().equals(typeList)) {
                    System.out.println(thisSong.getName());
                }
            }
        }
    }
    public static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song (String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public String getTypeList() {
            return typeList;
        }
    }
}
