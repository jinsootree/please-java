package 배열;

public class SumArray {
    public static void main(String[] args) {
        int []  runningMinutes = {42, 66, 57, 54, 88};
        int sum = 0;

    for (int i = 0; i < 5; i++)
    sum += runningMinutes[i];

       /* sum += runningMinutes[0];
        sum += runningMinutes[1];
        sum += runningMinutes[2];
        sum += runningMinutes[3];
        sum += runningMinutes[4]; */
        
        double average = sum / 5.0;

        System.out.printf("달리기 시간 총합 :  %d분\n", sum);
        System.out.printf("달리기 시간 평균 : %.1f분\n", average);
    }
}
