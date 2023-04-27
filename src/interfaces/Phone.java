package interfaces;

public class Phone implements Camera,Video,Music {

//issue = music and video
    @Override
    public void click() {

    }

    @Override
    public void back() {

    }

    @Override
    public void front() {

    }

    @Override
    public void next() {

    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {
        System.out.println("music stoped");
    }
}
