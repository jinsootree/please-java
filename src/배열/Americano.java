package 배열;

public class Americano {
    public static void main(String[] args) {
        int sales [] = {12, 18, 22, 24, 36};
        //int sales[] = new int[5];
        //sales[0] = 12;
        //sales[1] = 18;
        //sales[2] = 22;
        //sales[3] = 24;
        //sales[4] = 36;

        int sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4];

        System.out.printf("총 판매량 : %d잔\n", sum);

    }
}
