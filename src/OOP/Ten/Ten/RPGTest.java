package OOP.Ten.Ten;

public class RPGTest {
    public static void main(String[] args) {
      // 객체 생성 및 초기화
      Novice novice = new Novice();
      novice.name = "프로도";
      novice.hp = 100;
      Wizard wizard = new Wizard();
      wizard.name = "해리포터";
      wizard.hp = 120;
      wizard.mp = 100;
      // 두 객체의 펀치
      novice.punch();
      wizard.punch();
      // 위자드 객체의 파이어볼
      wizard.fireball();
    }
  }
  class Novice {
    String name;
    int hp;
    public void punch() {
      System.out.printf("[%s]의 펀치!!\n", name);
    }
  }
  class Wizard extends Novice {
    int mp;
    public void fireball() {
      System.out.printf("[%s]의 파이어볼@@\n", name);
    }
  }