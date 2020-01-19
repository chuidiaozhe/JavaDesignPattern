package facade;

public class Stereo {

    //使用单例模式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }


    public void on(){
        System.out.println("Stereo on ");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void play(){
        System.out.println("Stereo is playing");
    }

    public void pause(){
        System.out.println("Stereo pause ...");
    }
}
