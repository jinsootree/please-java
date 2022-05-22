package 메소드;

public class CubeVolume {
    public static void main(String[] args) {
       //변수 생성 
        int n = 3;
 //메소드 호출을 통한 값 계산
        int x = cube(n);
//결과 출력
        System.out.printf("%d의 세제곱 => %d", n, x);
    }
//cube(): n => n^3
    public static int cube(int num){
        //변수 생성
        int result;
        //2. 세제곱을 계산하세요
        result = num * num * num;
        //값 반환
        return result;

        
    }
    
}
