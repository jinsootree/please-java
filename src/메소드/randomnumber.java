package 메소드;

public class randomnumber {
    public static void main(String[] args) {
        int n = rolldie();
        System.out.printf("주사위의 눈:%d", n);
    }

    public static int rolldie(){
        double x = 6 * Math.random();
        int temp =(int) x;
        return temp + 1;
    }
    
}
