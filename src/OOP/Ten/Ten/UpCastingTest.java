package OOP.Ten.Ten;

public class UpCastingTest {
    public static void main(String[] args) {

      // 기사 객체 생성 및 초기화
      Knight knight = new Knight();
      knight.name = "아서스";
      knight.hp = 180;
      knight.strength = 50;

      // 도적 객체 생성 및 초기화
      Thief thief = new Thief();
      thief.name = "발리라";
      thief.hp = 120;
      thief.agility = 40;

      // 업 캐스팅 - 부모 타입으로 객체를 해석
      Adventurer adv0 = knight;
      Adventurer adv1 = thief;
      // 업캐스팅 된 객체 배열
      Adventurer[] advs = { adv0, adv1 };
      // 정보 출력
      for (int i = 0; i < advs.length; i++) {
        System.out.println(advs[i].toString());
      }
    }
  }
  // 부모 클래스 Adventurer를 만들기.
  class Adventurer {
    String name;
    int hp;
    public void punch() {
      System.out.printf("[%s]의 펀치!!\n", name);
    }
    public String toString() {
      return String.format("[%s] HP: %d", name, hp);
    }
  }
  class Knight extends Adventurer {
    int strength; // 힘
    public void berserker() {
      System.out.println("체력과 공격력이 증가합니다.");
    }
  }
  class Thief extends Adventurer {
    int agility; // 민첩
    public void sharpen() {
      System.out.println("크리티컬 확률이 증가합니다.");
    }
  }