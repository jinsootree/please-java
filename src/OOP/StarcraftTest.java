package OOP;

public class StarcraftTest {
    public static void main(String[] args) {
        Marine ma = new Marine("레이너", 80);
        Medic me = new Medic("모랄레스", 60);

        ma.stimpack();

        me.heal(ma);
    }
}

class Marine {
    String name;
    int hp;

    Marine (String s, int i) {
        name = s;
        hp = i;
    }

    void stimpack() {
        System.out.printf("[%s]의 스팀팩 [%d] -> ", name, hp);
        hp -= 10;
        System.out.printf("[%d]\n", hp);
    }

}

class Medic {
    String name;
    int hp;

    Medic (String s, int i1) {
        name = s;
        hp = i1;
    }

    void heal(Marine target) {
        System.out.printf("[%s]의 힐 -> [%s]의 체력 [%d]", name, target.name, target.hp);
        target.hp += 10;
        System.out.printf(" ->  [%d]", target.hp);
    }
}