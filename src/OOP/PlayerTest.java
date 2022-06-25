package OOP;

public class PlayerTest {
    public static void main(String[] args) {
        
        int [] Scoures0 =  {10, 9, 9, 8};
        int [] Scoures1 =  {9, 10, 9, 9};
        int [] Scoures2 =  {10, 9, 10, 10};
       

        
//객체 생성

        Player P0 = new Player("김땡땡", Scoures0);
        Player P1 = new Player("이땡땡", Scoures1);
        Player P2 = new Player("박땡땡", Scoures2);
      

//객체 배열 생성
Player [] Players = {P0, P1, P2};

// 출력
        
        for (int i = 0; i < Players.length; i++) {
        Players [i].printTotalhours();
        }

    }
}

class Player {

    String name;
    int [] Scoures;

    Player (String str, int [] arr ) {

        name = str;
        Scoures = arr;
    }

    void printTotalhours() {
        System.out.printf("총 획득 점수 { %s -> %d점 } \n", name, totalHours());
    }

    int totalHours() {
        int sum = 0;
        for (int i = 0; i < Scoures.length; i++) {
            sum += Scoures[i];
        }
        return sum;
    }
}