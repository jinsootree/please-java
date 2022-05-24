package 반복문;

public class Continue {
    public static void main(String[] args) {
        printSum(1,10);
    }
    public static void printSum(int start, int end) {
        int Sum = 0;

        for (int i = start; i <= end; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.printf("%d", i);
            Sum += i;
            if(i == end){
             break; }
            System.out.printf("+");
        }
        System.out.printf("\n => %d", Sum);
    }
    
}
