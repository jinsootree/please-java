package 반복문;

public class Continue {
    public static void main(String[] args) {
        printSum(1,10);
    }
    //start부터 end까지의 총합을 계산 및 출력
    public static void printSum(int start, int end) {
        //변수 생성
        int Sum = 0;

        for (int i = start; i <= end; i++){
            //3의 배수인 경우, 계산 안 함
            if (i % 3 == 0){
                continue; // 다음 반복으로 이동
            }
            System.out.printf("%d", i);
            Sum += i;
            if(i == end){//i==end라면
             break; }//밑의 줄을 실행하지 않고 강제 탈출
            System.out.printf("+");
        }
        //결과 출력
        System.out.printf("\n => %d", Sum);
    }
    
}
