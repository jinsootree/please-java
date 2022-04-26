public class printf7 {
    public static void main(String[] args) {
        double tall = 176.4;
        double weight = 82.34;

        System.out.printf("신장 : %dcm\n", (int) tall); //캐스팅 : double
        System.out.printf("체중 : %dkg\n", (int) weight);
    }
}
