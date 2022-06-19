package OOP;

public class GorokeTest {
    public static void main(String[] args) {

        Goroke pizza = new Goroke("피자", 1000);
        Goroke yachae = new Goroke("야채", 800);
        Goroke pot = new Goroke("팥", 500);

        System.out.println(pizza.str());
        System.out.println(yachae.str());
        System.out.println(pot.str());
    }
}

class Goroke {

    String name;
    int price;

    Goroke(String n, int p){
       name = n;
       price = p;
    }

    String str(){
        return String.format("고로케 {이름 : %s, 가격 : %d}", name, price);
    }
}
