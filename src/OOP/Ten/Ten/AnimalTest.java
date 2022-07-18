package OOP.Ten.Ten;

public class AnimalTest {
    public static void main(String[] args) {
      // 객체 생성
      Pet dog = new Pet();
      // 필드 초기화
      dog.name = "포메라니안";
      dog.age = 7;
      dog.price = 22000000;
      // 정보 출력
      System.out.printf("Pet { name: %s, age: %d세, price: %d원 }", dog.name, dog.age, dog.price);
    }
  }
  class Animal {
    String name; // 이름
    public void cry() {
      System.out.println("강아지가 짖습니다!");
    }
  }
  class Pet extends Animal {
    int age;     // 나이
    int price;   // 가격
    public void play() {
      System.out.println("애완 동물이 장난을 칩니다~");
    }
  }