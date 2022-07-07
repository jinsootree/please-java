package OOP.Four;

public class WebtoonTest {
    public static void main(String[] args) {
        Webtoon levelup = new Webtoon("나 혼자만 레벨업", "판타지", "추공");
        Webtoon sweethouse = new Webtoon("스위트 홈", "스릴러", "칸비");
        Webtoon iteawoonclass = new Webtoon("이태원 클래스", "드라마", "광진");

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
