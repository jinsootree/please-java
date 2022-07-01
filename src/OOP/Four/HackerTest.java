package OOP.Four;

public class HackerTest {
    public static void main (String[] args) {
      // 1. 계좌 생성
      Account myAccount = new Account(1000000);
      System.out.println(myAccount.toString());
      
      // 2. 계좌 해킹
      Hacker.malcious(myAccount);
      
      // 3. 결과 출력
      System.out.println(myAccount.toString());
    }
  }
  
  class Account {
    // 필드
    int balance;
  
    // 생성자
    public Account(int balance) {
      this.balance = balance;
    }
  
    // 메소드
    public String toString() {
      return String.format("Account { balance: %d }", balance);
    }
  }
  
  class Hacker {
    // 클래스 메소드 - 계좌의 잔액을 0원으로 변경
    public static void malcious(Account account) {
      /* 1. 파라미터 계좌의 잔액을 0으로 변경하세요. */
      account.balance = 0;
    }
  }
