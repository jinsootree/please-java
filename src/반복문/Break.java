package 반복문;

public class Break {
    public static void main(String[] args) {
        //1부터 10까지 총합 출력
        printSum(1, 10);
    }
    //start부터 end까지의 총합을 출력
    public static void printSum(int start, int end){

        //변수 생성
        int sum = 0;

        //총합 계산
        for(int i = start; i <= end; i++){
            System.out.printf("%d", i);

            sum += i ;
         // 마지막 숫자라면 아래의 내용을 수행하지 않고 탈출
            if(i == end){
                break;
            }
            
            System.out.printf("+");
        }
        //결과 출력
        System.out.printf("\n -> %d",sum);
    }
}
