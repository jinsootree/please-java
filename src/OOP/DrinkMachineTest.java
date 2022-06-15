package OOP;

public class DrinkMachineTest {
    public static void main(String[] args) {
        DrinkMachine machine1 = new DrinkMachine();
        DrinkMachine machine2 = new DrinkMachine();

        machine1.pushbutton(1);
        machine2.pushbutton(2);

        machine1.printOutput();
        machine2.printOutput();
    }
}

class DrinkMachine {
    String output;

    void pushbutton(int num){
        String[] drinks = {"콜라","사이다","환타"};
        output = drinks[num];
    }

    void printOutput() {
        System.out.println(output);
    }
}
