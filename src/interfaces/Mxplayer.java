package interfaces;

public class Mxplayer implements Video{
    @Override
    public void play() {
        System.out.println("video is being played");
    }

    @Override
    public void stop() {
        System.out.println("video is being stopped");
    }
}
