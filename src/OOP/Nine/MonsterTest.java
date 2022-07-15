package OOP.Nine;

import java.util.ArrayList;
public class MonsterTest {
  public static void main(String[] args) {
    // Monster 객체를 저장할 ArrayList 생성
    ArrayList<Monster> list = new ArrayList<Monster>();

    // Monster 객체 생성
    Monster slime = new Monster("슬라임", 1);
    Monster orc = new Monster("오크", 3);
    Monster golem = new Monster("골렘", 8);

    // ArrayList에 객체 담기
    list.add(slime);
    list.add(orc);
    list.add(golem);

    // 전체 출력
    System.out.println("=== 변경 전 ===");
    for (int i = 0; i < list.size(); i++) {
      Monster m = list.get(i); // i번째 요소 반환
      System.out.println(m.toString());
    }
    /* 1. 레벨 1의 토끼 객체를 생성. */
    Monster rabbit = new Monster("토끼", 1);

    /* 2. ArrayList의 첫 요소인 슬라임을 토끼로 변경. */
    list.set(0, rabbit);

    // 전체 출력
    System.out.println("=== 변경 후 ===");
    for (int i = 0; i < list.size(); i++) {
      Monster m = list.get(i); // i번째 요소 반환
      System.out.println(m.toString());
    }
  }
}
class Monster {

  // 필드
  private String name;
  private int level;

  // 생성자
  public Monster(String name, int level) {
    this.name = name;
    this.level = level;
  }

  // 메소드
  public String toString() {
    return String.format("Monster { name: %s, level: %d }", name, level);
  }
}