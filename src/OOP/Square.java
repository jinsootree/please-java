package OOP;

public class Square {
    int length;
    int area(){
        return length * length;
    }
    
    public static void main(String[] args) {
        Square s = new Square();
        s.length = 4;
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d",s.length,s.area());
    }
}
