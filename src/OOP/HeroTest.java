package OOP;

public class HeroTest {
public static void main(String[] args) {

    Hero ironman = new Hero("아이언맨", 80);
    Hero thanos = new Hero("타노스", 160);
    Hero thor = new Hero("토르", 150);
    Hero groot = new Hero("그루트", 40);

    System.out.println(ironman.toStr());
    System.out.println(thanos.toStr());
    System.out.println(thor.toStr());
    System.out.println(groot.toStr());

} 
}

class Hero {

String name;
int hp;

Hero(String n, int h){

    name = n;
    hp = h;
    
}

String toStr() {
    return String.format("히어로 { 이름 : %s, 체력 : %d }", name, hp);
}

}