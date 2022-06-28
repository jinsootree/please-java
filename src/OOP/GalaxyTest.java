package OOP;

public class GalaxyTest {
    public static void main (String[] args) {
      // 5칸 크기의 객체 배열 생성
      Galaxy[] phones = new Galaxy[5];
      
      // 배열 속 객체 할당
      for (int i = 0; i < phones.length; i++) {
        phones[i] = new Galaxy();
      }
      
      // 모든 객체 정보 출력
      for (int i = 0; i < phones.length; i++) {
        phones[i].print();
      }
      System.out.println("=========================");
      
      /* 2. Galaxy 객체의 개수를 클래스 변수로 출력하세요.*/
      System.out.printf("Galaxy 객체의 개수: %d", Galaxy.count);
    }  
  }
  
  // 클래스
  class Galaxy {
    // 필드(인스턴스 변수)
    String serialNum; // 일련번호
    
    /* 1. 해당 필드를 클래스 변수화 하세요. */
    static int count = 0;
    
    // 생성자
    Galaxy() {
      count++;
      char c = randomAlphabet(); // A ~ Z 중 택1
      serialNum = String.format("%c-%d", c, Galaxy.count);
    }
    
    // 메소드
    char randomAlphabet() {
      return (char) ('A' + Math.random() * 26); // A to Z
    }
    
    void print() {
      System.out.printf("Galaxy { serialNum: %s }\n", serialNum);
    }
}