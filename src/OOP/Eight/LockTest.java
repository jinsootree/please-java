package OOP.Eight;

public class LockTest {
    public static void main(String[] args) {
      // 객체 생성
      Lock lock = new Lock("123!@#");
      // 객체 비밀번호 변경
      lock.setPassword("654#@!");
      // 객체 정보 출력
      System.out.println(lock.toString());
    }
  }
  class Lock {
    // 필드
    private String password;
    // 생성자
    public Lock(String p) {
      password = p;
    }
    // 메소드
    public String toString() {
      return String.format("Lock { password: %s }", password);
    }
    // 세터
    public void setPassword(String newPassword) {
      password = newPassword;
    }  
  }