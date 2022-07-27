package OOP.Eleven;

public class HolyKnightTest {
    public static void main(String[] args) {
      // 성기사 객체 생성
      HolyKnight uther = new HolyKnight("우서", 180);
      // 탱커로서의 역할 수행
      Tanker t = uther;
      t.increaseHp();
      // 힐러로서의 역할 수행
      Healer h = uther;
      h.heal();
    }
  }
  interface Tanker {
    public void increaseHp();
  }
  interface Healer {
    public void heal();
  }
  /* 1. 탱커와 힐러 역할을 부여. */
  class HolyKnight implements Tanker, Healer {
    private String name;
    private int hp;
    
    public HolyKnight(String name, int hp) {
      this.name = name;
      this.hp = hp;
    }
    /* 2. Tanker의 메소드를 오버라이딩. */
    public void increaseHp() {
      System.out.println("전체 체력 +50 증가시킵니다.");
    }
    /* 3. Healer의 메소드를 오버라이딩. */
    public void heal() {
      System.out.println("체력을 +30 회복합니다.");
    }
  }
