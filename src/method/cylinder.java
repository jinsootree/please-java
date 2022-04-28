package method;

public class cylinder {
    public static void main(String[] args) {
        double r = 7;
        double h = 5;
        double v = volume(r, h);

        System.out.printf("반지름이 %.1f, 높이가 %.1f인 원기둥의 부피: %.1f", r, h, v);
    }
        public static double volume(double radius, double height){
            return Math.PI * radius * radius * height;
        }
            
        
    
    
}
