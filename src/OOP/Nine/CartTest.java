package OOP.Nine;
import java.util.ArrayList;

public class CartTest {
    public static void main(String[] args) {
        //item 객체 생성
        Item1 shirt = new Item1("Non-Iron 셔츠", 49900);
        Item1 pants = new Item1("셀비지 데님", 59900);
        Item1 sneakers = new Item1("컨버스", 69900);
        
        //ArrayList 객체 생성 및 Item 담기
        ArrayList <Item1> cart = new ArrayList <Item1> ();
        cart.add(shirt);
        cart.add(pants);
        cart.add(sneakers);
        
        int sum = 0;
        for (int i = 0; i < cart.size(); i++){
            Item1 item = cart.get(i);
            System.out.println(item.toStr());
            sum += item.getPrice();
        }
    
        System.out.println("=============");
        System.out.printf("총합 : %d원", sum);
    }    
}

class Item1 {
    private String name;
    private int price;

    public Item1 (String _name, int _price) {
        name = _name;
        price = _price;
    }

    public String toStr() {
        return String.format("이름 : %s \n가격 : %d", name, price);
    }
    public int getPrice(){
        return price;
    }
}
