package facade;

public class Client {

    public static void main(String[] args){

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();


        homeTheaterFacade.ready();

        homeTheaterFacade.pause();

        homeTheaterFacade.end();
    }

}
