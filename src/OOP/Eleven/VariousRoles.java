package OOP.Eleven;

public class VariousRoles {
    public static void main(String[] args) {
      // HongPark 객체 생성
      Jinsoo yoon = new Jinsoo();
  
      // 각 직업으로 변신
      Developer devYoon = yoon;
      Instructor instYoon = yoon;
      Chef chefYoon = yoon;
      
      /* 3. 직업별 메소드를 호출하여 코드를 완성하세요. */
      devYoon.programming("java");
      instYoon.teach("알고리즘");
      chefYoon.cook("불고기");
    }
  }
  
  interface Developer {
    public void programming(String lang);
  }
  
  interface Instructor {
    public void teach(String subject);
  }
  
  interface Chef {
    public void cook(String menu);
  }
  
  /* 1. 진수 클래스에 개발자, 강사, 요리사 역할을 부여. */
  class Jinsoo implements Developer, Instructor, Chef {
    private String name = "진수";
  
    
    /* 2. 구현하기로 한 인터페이스의 메소드를 오버라이딩.*/
    public void programming(String lang){
      System.out.printf("%s -> %s 프로그래밍 중!\n", name, lang);
    }
     public void teach(String subject){
      System.out.printf("%s -> %s 수업 중!\n", name, subject);
       
     }
     public void cook(String menu){
      System.out.printf("%s -> %s 중!\n", name, menu);
     }
  }