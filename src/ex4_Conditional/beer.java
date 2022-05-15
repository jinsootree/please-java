package ex4_Conditional;

public class beer {
    public static void main(String[] args) {
        order(18);
        order(19);
        order(20);
    }
    public static void order(int age){
        if (age >= 19){
            System.out.printf("%d세, 성인인증 완료 => 캔맥주가 나왔습니다, \n" , age);
        }
    }
}
