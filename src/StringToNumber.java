public class StringToNumber {
    public static void main(String[] args) {
        String strSeven =  "7";
        String strPi = "3.14";
        // 문자열 변수 생성

        int a = Integer.parseInt(strSeven);
        double b = Double.parseDouble(strPi);
        // 문자열을 숫자로 전환

        double c = a + b;
        //정수와 실수의 덧셈

        System.out.printf("%d + %.2f = %.2f" , a ,b, c);
        //형식 문자열 출력


    }
    
}
