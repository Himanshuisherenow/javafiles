package interfaces;

public class Myphone {
    private Camera pixel;
    private Video oppo;
    private Music boat;

public  Myphone(Camera some){
    pixel=some;

}
    public  Myphone(Music some){
        boat=some;

    }
    public  Myphone(Video some){
        oppo=some;

    }

    // nothing just pass different reference in contractors and you will get the result you want
    public void clickphoto(){
       this.pixel.click();

    }
    public void stopmusic(){
        this.boat.stop();
    }


    public static void main(String[] args) {

    Myphone something= new Myphone( new instacam());

    Camera some= new instacam();

  // new Camera().click();

        new Phone().stop();
        // it cant be done because Camera interface.

    }

}
