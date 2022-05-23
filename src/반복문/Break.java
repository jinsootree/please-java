package 반복문;

public class Break {
    public static void main(String[] args) {
        printSum(1, 10);
    }

    public static void printSum(int start, int end){
        int sum = 0;

        for(int i = start; i <= end; i++){
            System.out.printf("%d", i);
            sum += i ;

            if(i == end){
                break;
            }
            System.out.printf("+");
        }
        
        System.out.printf("\n -> %d",sum);
    }
}
