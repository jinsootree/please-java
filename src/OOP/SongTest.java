package OOP;

public class SongTest {
    public static void main(String[] args) {

        Song s0 = new Song("bad boy", "레드 벨벳");
        Song s1 = new Song("Rookie", "레드 벨벳");
        Song s2 = new Song("Kingdome", "레드 벨벳");

        Song[] songs = {s0,s1,s2};

        for (int i = 0; i < songs.length; i++) {
            System.out.println(songs[i].toStr());
        }
    }
    }

    class Song {

        String name;
        String singer;

        public Song(String n, String s) {
            name = n;
            singer = s;
        }

        String toStr() {
            return String.format("노래 { 제목 : %s, 가수 : %s}", name, singer);
        }


    }
    
