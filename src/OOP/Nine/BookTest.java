package OOP.Nine;

import java.util.ArrayList;

public class BookTest {
  public static void main(String[] args) {
    /* 1. Book을 담기 위한 ArrayList 객체를 생성. */
    ArrayList<Book> list = new ArrayList<Book>();
    
    /* 2. Book 객체를 생성. */
    Book onePiece = new Book("원피스", 4000);
    Book naruto = new Book("나루토", 4500);
    Book java = new Book("자바 프로그래밍", 24000);
    
    /* 3. ArrayList 객체에 Book 객체 담기. */
    list.add(onePiece); // 원피스 객체 담기
    list.add(naruto);   // 나루토 객체 담기
    list.add(java);     // 자바 객체 담기
    
    /* 4. 리스트에 담긴 모든 책 정보 출력 */
    for (int i = 0; i < list.size(); i++) {
      System.out.printf("list.get(%d) -> %s\n", i, list.get(i));
    }
  }
}

class Book {
  // 필드
  private String title;
  private int price;

  // 생성자
  public Book(String title, int price) {
    this.title = title;
    this.price = price;
  }

  // 메소드
  public String toString() {
    return String.format("Book { name: %s, price: %d }", title, price);
  }
}