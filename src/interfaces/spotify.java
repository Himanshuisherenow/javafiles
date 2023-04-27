package interfaces;

public class spotify implements Music{

    @Override
    public void play() {
        System.out.println("music is being played");
    }

    @Override
    public void stop() {
        System.out.println("music stopped");

    }

    @Override
    public void next() {
        System.out.println("song changed");

    }
}
