public class circle {
    public static void main(String[] args) {
        //입력값
    int r = Integer.parseInt("4");
    // 원의 넓이 = (s = pi * r * r) 계산 
    double s = Math.PI * r * r;


// 결과 출력
        System.out.printf("반지름이 %d인 원의 넓이 = %.3f", r, s);
    }
    
}
