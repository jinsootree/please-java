package ex4;

public class Leapyear {
    public static void main(String[] args) {
        System.out.printf("2020년은 윤년입니까? %b\n", isLeapyear(2020));
        System.out.printf("1900년은 윤년입니까? %b\n", isLeapyear(1900));
        System.out.printf("2000년은 윤년입니까? %b\n", isLeapyear(2000));
    }
    //연도를 입력받아, 윤년 여부를 반환하는 메소드
    public static boolean isLeapyear(int year){
boolean result = false;
if ( year % 4 == 0){
    result =  true;
if ( year % 100 == 0){
        result = false;
if ( year % 1000 == 0){
    result = true;
}
}    
}   
return result;
}
}
