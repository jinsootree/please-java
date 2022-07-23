package OOP.Ten.Ten;

public class OrcTest {
    public static void main(String[] args) {
      Orc a = new Orc("오크", 80);
      System.out.println(a.toString());
      OrcWarrior b = new OrcWarrior("오크전사", 120, 3);
      System.out.println(b.toString());
    }
  }
  class Orc {
    protected String name;
    protected int hp;
    
    public Orc(String name, int hp) {
      this.name = name;
      this.hp = hp;
    }
    public String toString() {
      return String.format("Orc { name: %s, hp: %d }", this.name, this.hp);
    }
  }
  class OrcWarrior extends Orc {
    protected int amor;
    public OrcWarrior(String name, int hp, int amor) {
      super(name, hp); //super 사용
      this.amor = amor;
    }
    // 메소드 오버라이딩
    public String toString() {
      return String.format("OrcWarrior { name: %s, hp: %d, amor: %d }", super.name, super.hp, this.amor);
    }
  }