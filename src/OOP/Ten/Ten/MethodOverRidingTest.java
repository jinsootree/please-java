package OOP.Ten.Ten;

public class MethodOverRidingTest {
    public static void main(String[] args) {
        // 객체 생성
        Square s = new Square();
        Triangle t = new Triangle();
        Circle c = new Circle();

        // 객체 초기화
        s.name = "정사각형";
        s.length = 5;
        t.name = "삼각형";
        t.base = 4;
        t.height = 3;
        c.name = "원";
        c.radius = 4;

        // 업 캐스팅 객체 배열 만들기
        Shape[] shapes = { s, t, c };

        // 모든 도형의 넓이 계산
        for (int i = 0; i < shapes.length; i++) {
          Shape tmp = shapes[i];
          System.out.printf("%s의 넓이 -> %.2f\n", tmp.name, tmp.area());
        }
      }
    }
    // 도형
    class Shape {
      String name;

      // 도형의 넓이를 반환
      public double area() {
        return 0;
      }
    }
    // 정사각형
    class Square extends Shape {
      int length; // 한 변의 길이

      public double area() {
        return length * length;
      }
    }
    // 삼각형
    class Triangle extends Shape {
      int base;   // 밑변
      int height; // 높이

      public double area() {
        return base * height / 2;
      }
    }
    // 원
    class Circle extends Shape {
        
      int radius; // 반지름
      public double area() {
        return Math.PI * radius * radius;
      }
    }