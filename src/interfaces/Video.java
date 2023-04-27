package interfaces;

public interface Video {
    public void play();
    public void stop();
    default void shoot(){
        System.out.println("video can be shot");
    }
}
