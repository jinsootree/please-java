package OOP.Nine;

import java.util.ArrayList;



public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<String>();

        names.add("kim");
        names.add("lee");
        names.add("park");
        names.add("choi");
        names.add("hong");
        names.add("no");



        for(int i = 0; i < names.size(); i++){
        System.out.printf("names.get(%d) -> %s\n", i, names.get(i));
    }
    }
}
