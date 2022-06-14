package OOP;

public class CatTest3 {
    public static void main(String[] args) {
        //고양이 객체 생성
        Cat1 cat1 = new Cat1();
        Cat1 cat2 = new Cat1();

        //객체 필드 초기화
        cat1.name = "네로";
        cat2.name = "나비";

        //고양이 메서드 meow
        cat1.meow();
        cat2.meow();
        
        //고양이 메서드 claw
        cat1.claw();
        cat2.claw();
    }
}

class Cat1 {
    //필드(상태) 영역
    String name;
    String breeds;
    int age;

    void meow(){
        System.out.printf("[%s]의 야옹\n", name);
    }

    void claw(){
        System.out.printf("[%s]의 할퀴기\n", name);
    }
}
