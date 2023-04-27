package inheritance;

public class Box {

    int a,b,c;
    public Box(int a,int b,int c){
        System.out.println("im in the Box contructor "+(a+b+c));
    };
    public Box(){
        System.out.println("empty constructor");
    }
    static void type(){
        System.out.println("im in the Box and type method");
    }
    public void method(){
        System.out.println("non static box method");
    }
}
