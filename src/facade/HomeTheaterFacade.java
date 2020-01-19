package facade;

public class HomeTheaterFacade {

    //定义多个子系统对象
    private TheaterLight theaterLight;
    private Popcorn  popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    //构造器
    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        popcorn = Popcorn.getInstance();
        stereo  = Stereo.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        dvdPlayer = DVDPlayer.getInstance();
    }

    //操作分4步

    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.on();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        theaterLight.off();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }


}
