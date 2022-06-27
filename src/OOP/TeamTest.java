package OOP;

public class TeamTest {
    public static void main(String[] args) {
        
//객체 생성

        Player kim = new Player("김땡땡", new int[] {9,8,10});
        Player lee = new Player("이땡땡", new int[] {10,9,10});
        Player park = new Player("박땡땡", new int[] {8,10,9});

        Player xi = new Player("xiao", new int[] {10,9,10});
        Player yu = new Player("yu", new int[] {8,9,10});
        Player xui = new Player("xui", new int[] {9,9,10});
      

//객체 배열 생성
Player [] koreaPlayers = {kim, lee, park};
Player [] chinaPlayers = {xi, yu, xui};

//팀 객체 생성
Team korea = new Team("대한민국", koreaPlayers);
Team china = new Team("중국", chinaPlayers);

// 출력
        
        korea.printTeamPoints();
        china.printTeamPoints();
        

    }
}

class Player {

    String name;
    int [] Scoures;

    Player (String str, int [] arr ) {

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
    Player [] players;

    Team (String str, Player[] arr) {
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
