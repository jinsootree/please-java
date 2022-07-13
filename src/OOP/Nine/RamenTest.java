package OOP.Nine;

import java.util.ArrayList;

public class RamenTest {
  public static void main(String[] args) {
    // Ramen 객체를 담기 위한 ArrayList 생성
    ArrayList<Ramen> list = new ArrayList<Ramen>();
    
    // Ramen 객체 생성
    Ramen shin = new Ramen("신라면", 800);
    Ramen jin = new Ramen("진라면", 700);
    Ramen bibim = new Ramen("비빔면", 600);
    
    /* 1. Ramen 객체를 ArrayList에 담기. */
    list.add(shin);  // 신라면
    list.add(jin);   // 진라면
    list.add(bibim); // 비빔면
    
    /* 2. ArrayList에 담긴 모든 객체 정보를 출력. */
    for (int i = 0; i < list.size(); i++) {
      Ramen ramen = list.get(i); // i 번째 요소 가져오기
      System.out.printf("%s\n", ramen.toString());
    }
    
    /* 3. ArrayList에 담겨진 객체의 총합을 계산. */
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      Ramen ramen = list.get(i); // i 번째 요소 가져오기
      sum += ramen.getPrice();// 라면 가격을 누적하여 더하기
    }
    System.out.println("================================");
    System.out.printf("합계 : %d원", sum);

  }
}

class Ramen {
  // 필드
  private String name;
  private int price;
  
  // 생성자
  public Ramen(String name, int price) {
    this.name = name;
    this.price = price;
  }
  
  // 메소드
  public String toString() {
    return String.format("Ramen { name: %s, price: %d }", name, price);
  }

  /*4. price에 대한 게터. */
  public int getPrice(){
    return this.price;
  }
  
}