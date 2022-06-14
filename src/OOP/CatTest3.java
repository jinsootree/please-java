package OOP;

public class CatTest3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "네로";
        cat1.name = "나비";

        cat1.meow();
        cat2.meow();

        cat1.claw();
        cat2.claw();
    }
}

class Cat {
    String name;
    String breeds;
    int age;

    void meow(){
        System.out.printf("[%s]의 야옹\n",name);
    }

    void claw(){
        System.out.printf("[%s]의 할퀴기\n",name);
    }
}
