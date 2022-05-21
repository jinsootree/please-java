package 조건문;

public class OddOrEven {
    public static void main(String[] args) {
        printResult(13);
        printResult(6);
    }
    //정수를 입력받아, 홀수나 짝수 여부를 출력하는 메소드
    public static void printResult(int n){
        String result = ( n%2 ==  0) ?  "짝수" : "홀수";
        System.out.printf("정수  %d은 %s 입니다.\n", n, result);
    }
}
