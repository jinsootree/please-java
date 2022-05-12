package ex4_Conditional;

public class Scholarship {
    public static void main(String[] args) {
        printScholarship("park", 100, 92);
        printScholarship("kim", 82, 96);
        printScholarship("choi", 82, 88);
    }

    //이름과 수학 및 영어 점수를 입력받아, 장학금 수령 여부를 출력
    
    public static void printScholarship(String name, int math, int eng){
        String result = "";

    if(math>=90 && eng >=90){
        result ="전액 장학금";
    } else if (math>=90 || eng>=90) {
        result = "반액 장학금";
    } else {
        result = "다음 기회에";
    }

System.out.printf("%s => %s\n", name, result);
    }   
}
