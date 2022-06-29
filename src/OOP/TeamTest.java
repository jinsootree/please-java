package OOP;

public class TeamTest {
    public static void main(String[] args) {
        
//객체 생성

        Player1 kim = new Player1("김땡땡", new int[] {9,8,10});
        Player1 lee = new Player1("이땡땡", new int[] {10,9,10});
        Player1 park = new Player1("박땡땡", new int[] {8,10,9});

        Player1 xi = new Player1("xiao", new int[] {10,9,10});
        Player1 yu = new Player1("yu", new int[] {8,9,10});
        Player1 xui = new Player1("xui", new int[] {9,9,10});
      

//객체 배열 생성
Player1 [] koreaPlayers = {kim, lee, park};
Player1 [] chinaPlayers = {xi, yu, xui};

//팀 객체 생성
Team korea = new Team("대한민국", koreaPlayers);
Team china = new Team("중국", chinaPlayers);

// 출력
        
        korea.printTeamPoints();
        china.printTeamPoints();
        

    }
}

class Player1 {

    String name;
    int [] Scoures;

    Player1 (String str, int [] arr ) {

        name = str;
        Scoures = arr;
    }

    void printTotalPoints() {
        System.out.printf("총 획득 점수 { %s -> %d점 } \n", name, totalPoints());
    }

    int totalPoints() {
        int sum = 0;
        for (int i = 0; i < Scoures.length; i++) {
            sum += Scoures[i];
        }
        return sum;
    }
}

class Team {
    String nation;
    Player1 [] players;

    Team (String str, Player1 [] arr) {
        nation = str;
        players = arr;
    }

    void printTeamPoints(){
        int sum = 0;
        for (int i = 0; i < players.length; i++) {
            sum += players[i].totalPoints();
        }
        System.out.printf("%s -> %d점 \n", nation, sum);

    }

}
