package OOP.Eight;

public class MethodScope {
    public static void main(String[] args) {
      // main 메소드의 지역변수 score
      int score = 88;
      System.out.printf("score = %d in main()\n", score);
      
      // Record 클래스의 메소드 수행
      Record.foo(score);
      
      // main 메소드의 지역변수 score 출력
      System.out.printf("score = %d in main()\n", score);
    }
  }
  
  class Record {
    // 클래스 메소드
    public static void foo(int score) {
      // printMinus10 메소드의 파라미터 score의 값을 10 감소
      score -= 10;
      // printMinus10 메소드의 파라미터 score의 값을 출력
      System.out.printf("score = %d in foo()\n", score);
    }
  }
  