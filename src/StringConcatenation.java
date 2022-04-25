public class StringConcatenation {
    public static void main(String[] args) {
        int month = 8;
        int day = 23;
        int n = 1;
        double weight = 5.4;
        String numStr = "123";
        int m = 456;
        double b = 78.9;

        System.out.println(numStr + m + b);

        System.out.println("---------");
        System.out.println("고양이의" + month + "월" + day + "일 다이어트 일지");
        System.out.println("---------");
        System.out.println("식사횟수 :" + n + "회");
        System.out.println("몸무게" + weight + "kg");
        
    }
}
