package ex4_Conditional;

public class CannedBeer {
    public static void main(String[] args) {
        Buy(20);
        Buy(18);
    }

    //입력 나이에 따라 캔맥주 구매 여부를 결정
    public static void Buy(int age){
        if(age >= 19){
            System.out.printf("%d세, 캔맥주 구매 가능\n" , age);
        }
        else {
            System.out.printf("%d세, 캔맥주 구매 불가" , age);
        }
    }
}
