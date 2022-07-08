package OOP.Eight;

public class WebtoonTest {
    public static void main(String[] args) {
        Webtoon levelup = new Webtoon("이끼", "스릴러", "윤태호");
        Webtoon sweethouse = new Webtoon("송곳", "현실 비판", "최규석");
        Webtoon iteawoonclass = new Webtoon("용비불패", "무협", "류기운");

        Webtoon[] webtoons = { levelup, sweethouse, iteawoonclass};
        for (int i = 0; i < webtoons.length; i++) {
            System.out.println(webtoons[i].toStr());
        }
         System.out.printf("웹툰의 총 개수 : %d", Webtoon.getCount());

        
    }
}

class Webtoon {
    private String title;
    private String genre;
    private String author;
    private static int count = 0;

    public Webtoon(String t, String g, String a){
        title = t;
        genre = g;
        author = a;
        Webtoon.count++;
    }

    public String toStr() {
        return String.format("Webtoon { title : %s, genre : %s, author : %s } ", title, genre, author);
    }
    public static int getCount() {
        return Webtoon.count;
    }
    
}
