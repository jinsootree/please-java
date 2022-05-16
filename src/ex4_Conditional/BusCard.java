package ex4_Conditional;

public class BusCard {
    public static void main(String[] args) {
        printRole(22); 
        printRole(16); 
        printRole(10); 
        printRole(4); 

    }
public static void printRole(int age){
    String role = "";

    if (age >= 18){
        role = "성인";
    } else if (age >= 13){
        role = "청소년";
    } else if (age >= 6){
        role = "어린이";
    } else {
        role = "유아";
    }

    System.out.printf("%d살 => %s입니다.\n", age, role);
}
}
