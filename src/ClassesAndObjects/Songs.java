package ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class Song {
        String type;
        String name;
        String time;

        public Song(String type, String name, String time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Song> songsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] songInfo = scan.nextLine().split("_");
            String type = songInfo[0];
            String name = songInfo[1];
            String time = songInfo[2];

            Song currentSong = new Song(type, name, time);

            songsList.add(currentSong);

        }

        String searchType = scan.nextLine();

        for (Song song : songsList) {

            if (searchType.equals("all")) {
                System.out.println(song.getName());
            } else if (song.getType().equals(searchType)) {
                System.out.println(song.getName());
            }

        }
    }
}
