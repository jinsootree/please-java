public class printf8 {
    public static void main(String[] args) {
        
        String strSeven = "7";
        String strPi = "3.14";

        int a = Integer.parseInt(strSeven);
        double b = Double.parseDouble(strPi);

        double c = a + b;

        System.out.printf("%d + %.2f = %.2f", a, b, c);


    }
    
}
