package abstraction;

public class son extends perent{

    public void run(){
        System.out.println("im running father");
    }

    public static void main(String[] args) {
        son one=new son();
        one.run();
    }
}
