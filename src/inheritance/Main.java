package inheritance;

public class Main {
    public static void main(String[] args) {

        Box obj =new Boxweight(2,3,4,8);

        // Boxweight obj1=new Box();
        // what's the problem in this upper object call is that
        // boxweight can access a,b,c,d
        //box can access a,b,c
        //ref type boxweight variable's are accessed by you now ,so you can access weight,
        // but the problem arise is that with a box object you can only initialize a,b,c means object's(here perent class variables)
        //but how can you initialize the properties which are in ref type


        Box.type();
        Box box=new Boxweight(2,3,4,5);
        box.type();


        //here child means object method is not called
        //static methods are not depend upon class. so there is no sense
        //overriding it in the child class because the method in the perent calls not dependent on class


        Boxweight pop=new Boxweight();
        Boxweight.type();
        Box.type();
        pop.type();
        box.method();


        //if you have ref type is perent class, and you are calling child class object
        // here what happen is that first method name method will get search in the perent class,
        //and if java is not finding method name method
        // in perent it will give you error like above and if you have a method inside perent one then it will give go
        //child class and see that if there is any method name method is available or not, so here method which one to call
        // will be the object ones
        //


        //here you can access type static class even you are using boxweight
        //static method can be inherited but can't override.
        //how static methods can be inherited means how boxweight use it
        //when Boxweight have their own static method in run instead of perets one's with boxweight object
    }
}
