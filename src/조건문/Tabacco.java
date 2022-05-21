package 조건문;

public class Tabacco {
    public static void main(String[] args) {
        buy(15);
        buy(19);
        buy(22);

    }
    public static void buy(int age){
        String result = "";

        if(age >= 19 ) {
            result = "0"; // 19세 이상은 판매 허용
        } else {
            result = "X"; // 19세 미만은 판매 금지!
        }
        System.out.printf("%d세 => 담배판매(%s)\n", age, result);
    }
}
