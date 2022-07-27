package OOP.Eleven;

public class PhoneTest {
    public static void main(String[] args) {
      // 객체 생성
      IPhone sp = new IPhone("아이폰", "010-0000-0000");
  
      // 전화 걸기
      sp.call("010-1234-5678");
      
      // 전화벨이 울림
      sp.ring();
    }
  }
  
  interface Phone {
    // targetNumber로 전화를 걸거야! 어떻게? 그건 아직 몰라!
    public void call(String targetNumber);
    
    // 전화벨이 울릴거야! 어떻게? 그건 아직 몰라!
    public void ring();
  }
  
  //구현체 클래스
  class IPhone implements Phone {
    protected String name;
    protected String phoneNumber;
    
    public IPhone(String name, String phoneNumber) {
      this.name = name;
      this.phoneNumber = phoneNumber;
    }
    
    /* Phone 인터페이스의 모든 프로토타입 메소드를 구현하시오. 재정의(중요)*/
    public void call(String targetNumber){
      System.out.printf("%s로 전화를 겁니다.\n", targetNumber);
  }
    public void ring(){
      System.out.println("전화벨이 울립니다.");
    }
  }
  