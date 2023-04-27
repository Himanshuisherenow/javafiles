package inheritance;

public class Boxweight extends Box{
    int d;

    Boxweight(){
        System.out.println("box weight contructor which is not filled");
    }

    Boxweight(int a, int b, int c, int d){
        super();//whenever this super keyword used like this all th perents contructor which are have a same parameter will run automatically
        this.d=d;
        System.out.println("I'm in the Box-weight constructor");
//        this.method(); take a look on this
//        super.method();
    }


    public void method(){
        System.out.println("this is method of non static boxweight");
    }
    // @Override  you can't use it cant be Overriden
    public static void type(){
        System.out.println("box weight method");
    }
}
