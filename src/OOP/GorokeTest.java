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

//필드

    String name;
    int price;

//생성자

    Goroke(String n, int p){
       name = n;
       price = p;
    }
//메소드 - 고로케 객체의 필드 정보를 문자열로 반환

    String str(){
        return String.format("고로케 {이름 : %s, 가격 : %d}", name, price);
    }
}
