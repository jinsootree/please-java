package method;

public class CubeVolume {
    public static void main(String[] args) {
        
        int n = 3;
        int x = cube(n);

        System.out.printf("%d의 세제곱 => %d", n, x);
    }

    public static int cube(int num){
        int result;
        result = num * num * num;
        return result;

        
    }
    
}
