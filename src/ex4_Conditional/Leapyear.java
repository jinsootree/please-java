package ex4_Conditional;

public class Leapyear {
    public static void main(String[] args) {
       int input =  Integer.parseInt(args[0]); // 입력값 받기
       Boolean ouput = isLeapyear(input); // 윤년여부 계산
    }

    // 연도를 입력받아, 윤년 여부를 반환하는 메소드
    public static boolean isLeapyear(int year) {
        boolean result = false;
        if (year % 4 == 0) {
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
