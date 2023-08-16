package WednesdayLiveSession.week12.appTask;

public class Instagram extends App{
    /*
     Create a class Instagram

        - Instagram class inherits App class

        - create a constructor to call the parent constructor and set up variables (name and version)

        - create method:
            postPicture()
                Example output: prints Posting picture to Instagram
     */

    public Instagram(double version) {
        super(version);
    }

    public void postPicture(){
        System.out.println("Posting picture to "+name);
    }
}
