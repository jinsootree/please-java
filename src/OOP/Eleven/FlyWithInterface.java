package OOP.Eleven;


public class FlyWithInterface {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter copter = new Helicopter();
        Rocket rocket = new Rocket();
        Flyable[] arr = {bird, copter, rocket};
        for (int i = 0; i < arr.length; i++) {
            arr[i].fly();
        }
    }
}

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("[새]가 날개를 퍼덕이며 날아갑니다!");
    }
}

class Helicopter implements Flyable {
    public void fly() {
        System.out.println("[헬기]가 프로펠러를 돌리며 날아갑니다.");
    }
}

class Rocket implements Flyable {
    public void fly() {
        System.out.println("[로켓]이 불꽃을 뿜으며 날아갑니다!");
    }
}