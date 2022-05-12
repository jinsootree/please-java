package ex4_Conditional;

public class TrafficLight {
    public static void main(String[] args) {
        light("RED");
        light("YELLOW");
        light("GREEN");
        light("BLUE");

    }

    //색을 입력받아, 신호등 불빛을 출력하는 메소드
    public static void light(String color){

    switch (color){
    case "RED" :
        System.out.println("빨간불이 켜집니다.");
        break ;

    case "YELLOW" :
        System.out.println("노란불이 켜집니다.");
        break ;

    case "GREEN" :
        System.out.println("초록불이 켜집니다.");
        break ;

    default :
        System.out.printf("에러, 잘못된 색 입력: %s\n", color);
    }
 }

}