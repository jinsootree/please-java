package lab2_1;

public class Converter {
    public static void main(String[] args) {

        double fahrenheit = 77.0;
        //변환하려는 화씨값
        double celsius = (fahrenheit - 32.0) / 1.8;
        //온도변환 공식

        System.out.printf("화시 %.1f도는 섭씨로 %.1f도입니다.", fahrenheit, celsius);
        //%.1f = 소수점 1자리수
    }
}
