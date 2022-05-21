package 조건문;

public class Leapyear {
    public static void main(String[] args) {
       
       System.out.printf("2000년은 윤년입니까? %s\n", isLeapyear(2000));
       System.out.printf("2020년은 윤년입니까? %s\n", isLeapyear(2020));
       System.out.printf("1900년은 윤년입니까? %s\n", isLeapyear(1900));

    }

    // 연도를 입력받아, 윤년 여부를 반환하는 메소드
    public static boolean isLeapyear(int year) { //윤년 판별 메소드
        boolean result = true; // 변수 생성
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
