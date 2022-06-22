package OOP;

public class HeroTest1 {
    public static void main(String[] args) {

        Hero1 zoro = new Hero1("조로", 150);
        Hero1 sangdi = new Hero1("상디", 160);

        zoro.punch(sangdi);
        zoro.punch(sangdi);
        sangdi.punch(zoro);

        
    }
}

class Hero1 {

    String name;
    int hp;

    Hero1(String s, int i) {
        name = s;
        hp = i;
    }

    void punch(Hero1 enemy) {
        System.out.printf("[%s]의 펀치~ ", name);

        enemy.hp -= 10;
        System.out.printf("-> %s의 체력 : %d\n ", enemy.name, enemy.hp);



    }

}
