package ex4_Conditional Statements;

public class AirConverter {
    public static void main(String[] args) {
        turnOn(30);
        turnOn(19);
    }

    //입력된 현재 온도를 기준 삼아, 에어컨 가동 문구를 출력
    public static void turnOn(int temperature){
        if (temperature > 25){
            System.out.printf("현재온도 %d도, 에어컨을 가동합니다.", temperature);
        }
    }
}