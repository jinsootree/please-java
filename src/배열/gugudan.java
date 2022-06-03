package 배열;

public class gugudan {
    public static void main(String[] args) {
        int [][] gugudan = new int [10][10];

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j<= 9; j++) {
                gugudan[i][j] = i*j;
            }
        }

        System.out.printf("2*7=%d\n",gugudan[2][7]);
        System.out.printf("9*4=%d\n",gugudan[9][4]);

        
     } 

}
