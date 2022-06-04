package 배열;

public class dailyuser {
    public static void main(String[] args) {
        //1.배열 만들기
        int [] counts = {581,512,527,495,423,141,236};
        //2. 메소드 호출해서 계산
        double result = average(counts);
        //3. result 출력
        System.out.printf("하루 평균 사용자 : %.2f명",result);
    }

    public static double average(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }
}
