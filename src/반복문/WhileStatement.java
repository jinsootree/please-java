package 반복문;

public class WhileStatement {
    public static void main(String[] args) {
        // 입력
        int startNum = Integer.parseInt("5");
        //카운트다운 출력
        countDown(startNum);
    }

    public static void countDown(int num){
        System.out.println("카운트다운을 시작합니다..");
        while (num >= 0 ){
            System.out.printf("%d..\n",num);
            num --;
        }
        System.out.println("발사!!");
    }
}
