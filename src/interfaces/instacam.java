package interfaces;

public class instacam implements Camera{
    @Override
    public void click() {
        System.out.println("photo clicked");
    }

    @Override
    public void back() {
        System.out.println("back camera enable");
    }

    @Override
    public void front() {
        System.out.println("front camera enable");

    }
}
