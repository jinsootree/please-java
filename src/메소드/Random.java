package 메소드;

public class Random {
    public static void main(String[] args) {
        int x = rolldie();

        System.out.printf("주사위의 눈: %d", x);
    }

        public static int rolldie() {
            double r = 6 * Math.random();
            int temp = (int) r;
            int n = temp +1;
            return n;
        }
            
    
}
