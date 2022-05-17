package ex4_Conditional;

public class Scholarship {
    public static void main(String[] args) {
        printScholarship("park", 100, 92);
        printScholarship("kim", 82, 96);
        printScholarship("choi", 82, 88);
    }

    //이름과 수학 및 영어 점수를 입력받아, 장학금 수령 여부를 출력
    
    public static void printScholarship(String name, int math, int eng){
        //변수 생성
        String result = "";

    //조건에 따른 값 변경
    if(math>=90 && eng >=90){/* 전액장학금 조건*/
        result ="전액 장학금";
    } else if (math>=90 || eng>=90) {/*반액 장학금 조건*/
        result = "반액 장학금";
    } else {
        result = "다음 기회에";
    }
//결과 출력
System.out.printf("%s => %s\n", name, result);
    }   
}
