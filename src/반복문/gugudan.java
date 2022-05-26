package 반복문;

public class gugudan {
    public static void main(String[] args) {
        printgugudan();
    }
    public static void printgugudan(){
        for (int i =2; i <= 9; i++){
            printDan(i);
        }
    

    }
    public static void printDan(int Dan){
        System.out.printf("%d단\n", Dan);
        for (int n = 1; n <= 9; n++){
            System.out.printf("\t");
            System.out.printf("%d * %d = %d\n", Dan, n, Dan * n);
        }
    }
}
