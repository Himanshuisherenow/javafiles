package exception.THrow;

public class userdefinexception {

    public static void main(String[] args) {
        try {
            vote(45);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void vote(int age) throws InvalideAgeEception {
        if(age<18){
            throw new InvalideAgeEception("Not eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
}
class InvalideAgeEception extends Exception{
    InvalideAgeEception(String msg){
        System.out.println(msg);
    }

}
