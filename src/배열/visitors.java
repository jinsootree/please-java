package 배열;

public class visitors {
    public static void main(String[] args) {
        int [] visitors = {599,51,46,43,27};

        int sum = 0;
        for (int i = 0; i < visitors.length; i++ ){
            sum += visitors[i];
        } 
        System.out.printf("총 관광객 수 : %d", sum);
    }
}
