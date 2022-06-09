package OOP;

public class Main{
public static void main(String[] args) {
    Dog d = new Dog();
System.out.printf("이름 : %s\n", d.name);
System.out.printf("품종 : %s\n", d.breeds);
System.out.printf("나이 : %s\n",d.age);


}
}

class Dog {
    String name;
    String breeds;
    int age;

    void wag(){
        System.out.println("꼬리를 친다.");
    }
    void bark(){
        System.out.println("짖습니다.");
    }
    
}
