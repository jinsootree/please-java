package OOP;

public class Dog1 {
    String name; // 이름
    String breeds; // 품종
    int age; // 나이

    void wag() {
        System.out.printf("[%s] 살랑살랑~\n", name);
    }

    void bark() {
        System.out.printf("[%s] 멍멍!\n", name);
    }

    void bark(int times) {
        String sound = "컹컹!";
        System.out.printf("[%s] %s(x%d)\n", name, sound, times);
    }

    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        Dog1 d2 = new Dog1();

        d1.name = "망고";
        d1.breeds = "골든리트리버";
        d1.age = 2;
        d2.name = "까미";
        d2.breeds = "믹스";
        d2.age = 3;

        System.out.printf("d1 => {%s, %s, %d세}\n",
                d1.name, d1.breeds, d1.age);
        System.out.printf("d2 => {%s, %s, %d세}\n",
                d2.name, d2.breeds, d2.age);

        d1.wag(); // 꼬리치기
        d2.bark(); // 짖기
        d1.bark(3); // 짖기 3회
    }
}
