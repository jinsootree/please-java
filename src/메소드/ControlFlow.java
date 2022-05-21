package method;

public class ControlFlow {
    public static void main(String[] args) {
        drawRectangle();
    }
    public static void drawRectangle(){
        drawLine();
        drawEdge();
        drawLine();

    }
    public static void drawLine(){
        System.out.println("******");
    }
    public static void drawEdge(){
        System.out.println("*    *");
    }
    
}
