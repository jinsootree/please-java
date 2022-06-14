package OOP;

public class CatTest {
public static void main(String[] args) {
    Cat c = new Cat();

    c.name = "네로";
    c.breeds = "페르시안";
    c.age = 3;

    System.out.printf("이름 : %s\n", c.name);
    System.out.printf("품종 : %s\n", c.breeds);
    System.out.printf("나이 : %s\n", c.age);

}
}

class Cat{

    String name;
    String breeds;
    int age;

    void claw(){
        System.out.println("할퀴기");
    }

    void meow(){
        System.out.println("야옹1");
    }
}