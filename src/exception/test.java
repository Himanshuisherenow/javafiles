package exception;

public class test {
    public static void main(String[] args) {

        String v="Happy";//"234"
        int a=0;
        try
        {
            a= Integer.parseInt(v);
        }
        catch(NumberFormatException e){
            System.out.println("normal string cant be integer");
        }
        finally {
            System.out.println("task completed");
        }
        System.out.println(a);
    }
}
// you also can nested try and catch and also finally
//exception and errors are different
