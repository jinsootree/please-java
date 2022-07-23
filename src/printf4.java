public class printf4 {
    public static void main(String[] args) {
       String name = "진수";
       String hobby = "책읽기";
       
       System.out.printf("이름 : %s\n", name);
       System.out.printf("취미 : %s\n", hobby);

       double pi = 3.14159265;

       System.out.printf("%.2f\n", pi);
    }
    
}
