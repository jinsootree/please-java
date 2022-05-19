package ex4_Conditional;

public class Leapyear {
    public static void main(String[] args) {
       
       int input =  Integer.parseInt("1988"); // 입력값 받기
       Boolean output = isLeapyear(input); // 윤년여부 계산
       System.out.printf("%d년은 윤년입니까? %s", input, output);
    }

    // 연도를 입력받아, 윤년 여부를 반환하는 메소드
    public static boolean isLeapyear(int year) { //윤년 판별 메소드
        boolean result = false; // 변수 생성
        if (year % 4 == 0) { // 조건문 처리 (윤년 여부 판별)
            result = true;
            if (year % 100 == 0) {
                result = false;
                if (year % 1000 == 0) {
                    result = true;
                }
            }
        }
        
        return result;
    }
    
}
