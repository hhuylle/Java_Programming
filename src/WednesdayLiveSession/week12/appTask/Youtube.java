package WednesdayLiveSession.week12.appTask;

public class Youtube extends App{
    /*
     Create a class Youtube

        - Youtube class inherits App class

        - create a constructor to call the parent constructor and set up variables (name and version)

        - create method:
            watchVideo()
                Example output: prints Watching java tutorial
     */
    public Youtube(double version){
        super(version);
    }

    public void watchVideo(){
        System.out.println("Watching Java tutorial on "+name);
    }
}
