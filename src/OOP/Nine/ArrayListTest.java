package OOP.Nine;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
//String을 담을 수 있는 ArraryList 객체 생성
        ArrayList <String> names = new ArrayList<String>();
//리스트에 이름 추가
        names.add("kim");
        names.add("lee");
        names.add("park");
        names.add("choi");
        names.add("hong");
        names.add("no");

//반복문을 통해 출력
        for(int i = 0; i < names.size(); i++){
        System.out.printf("names.get(%d) -> %s\n", i, names.get(i));
    }
}
}
