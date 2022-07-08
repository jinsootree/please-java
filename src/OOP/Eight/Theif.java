package OOP.Eight;

public class Theif {
  // 메인 메소드
  public static void main(String[] args) {
    // 지갑 객체 생성
    Wallet wallet = new Wallet(30000);
    System.out.print(wallet.toString());
    // 지갑에서 돈을 모두 꺼냄
    Theif.steal(wallet);
    // 지갑 확인
    System.out.println(" -> " + wallet.toString());
  }
  // 클래스 메소드
  public static void steal(Wallet target) {
    target.money = 0;
  }
}
class Wallet {
  // 필드(인스턴스 변수)
  /*private* private을 사용하면 money는 public이 아닌 private이기 때문에 접근할 수 없다.*/
  int money;
  // 생성자
  public Wallet(int i) {
    money = i;
  }
  // 메소드
  public String toString() {
    return String.format("Wallet { money: %d }", money);
  }
}

