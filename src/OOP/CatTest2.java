package OOP;

public class CatTest2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

    //메소드 호출
    
        cat1.meow();
        cat2.meow();

        cat1.claw();
        cat2.claw();
    
    }
    }
    //cat 클래스

    class Cat{

    //필드(상태)

        String name;
        String breeds;
        int age;

    //메소드(동작)

        void claw(){
            System.out.println("냥냥펀치");
        }
    
        void meow(){
            System.out.println("야옹");
        }
    }