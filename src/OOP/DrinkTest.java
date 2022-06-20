package OOP;

public class DrinkTest {
    public static void main(String[] args) {
        Drink d1 = new Drink();
        d1.name = "포카리";
        d1.price = 1000;

        Drink d2 = new Drink("박카스", 800);

        System.out.println(d1.toStr());
        System.out.println(d2.toStr());

    }
}

class Drink {

    String name;
    int price;

    Drink () {}

    Drink(String n, int p) {
        name = n;
        price = p;
    }

    String toStr(){
        return String.format("음료수 { 이름 : %s, 가격 : %d}", name, price);
    }
}