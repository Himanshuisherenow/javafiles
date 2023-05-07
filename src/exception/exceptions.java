package exception;

public class exceptions {
    public static void main(String[] args) {


        String F = null;
        try {
            System.out.println(F.toLowerCase());
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
