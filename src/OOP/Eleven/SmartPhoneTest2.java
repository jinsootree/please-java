package OOP.Eleven;

public class SmartPhoneTest2 {
    public static void main(String[] args) {
      // 객체 생성
      SmartPhone iPhone = new SmartPhone("아이폰 X");
      // 비프음 내기
      iPhone.beep();
      // 음악 재생하기
      iPhone.playMusic("상어송");
    }
  }
  interface Alarm {
    public void beep();                  // 비프음
    public void playMusic(String title); // 음악 재생
  }
  class SmartPhone implements Alarm {
    public String name; // 모델명
    public SmartPhone(String name) {
      this.name = name;
    }
    public void beep() {
      System.out.println("삐빕! 삐비비빕~!");
    }
    public void playMusic(String title) {
      System.out.printf("[%s]을 재생합니다..!\n", title);
    }
  }