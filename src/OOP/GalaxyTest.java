package OOP;

public class GalaxyTest {
    public static void main(String[] args) {
        Galaxy[] phones = new Galaxy [5];

        for (int i = 0; i < phones.length; i++) {
            phones[i] = new Galaxy();
        }

        for (int i = 0; i < phones.length; i++)  {
            phones[i]. print();
        }
        System.out.println("===============");

        System.out.printf("Galaxy 객체의 개수: ?");
    }
}

class Galaxy {
    String serialNum;
    
    Static int count = 0;

    Galaxy() {
        count++;
        char c = ramdomAlphabet();
        serialNum = String.format("%c-%d", c, Static.count);
    }

    char ramdomAlphabet() {
        return (char) ('A' + Math.random() * 26);
    }
    
    void print() {
        System.out.printf("Galaxy { serialNum : %s}\n", serialNum);
    }

}
