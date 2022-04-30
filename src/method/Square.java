package method;

public class Square {
    public static void main(String[] args) {
        int n = 4;
        int s = square(n);
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", n, s);
    }

    //정수를 입력받아 그 제곱을 반환하는 메소드
    public static int square(int length){  
        return length * length;

    }
    
}
