package method;

public class whatiswrong {
    public static void main(String[] args) {
        int a = Square((int) 3.0);
        int b = (int) cube(2);
        System.out.printf("a = %d, b = %d\n", a, b);

    }
    public static int Square(int n) {
        return n * n;
    }

    public static double cube(double n){
        return n * n * n;
    }
}
