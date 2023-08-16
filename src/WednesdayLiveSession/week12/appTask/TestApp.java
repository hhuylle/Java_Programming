package WednesdayLiveSession.week12.appTask;

public class TestApp {

    public static void main(String[] args) {

        Instagram instagram = new Instagram(3.1);
        instagram.download();
        instagram.postPicture();

        System.out.println();

        Youtube youtube = new Youtube(4.1);
        youtube.download();
        youtube.watchVideo();

        System.out.println();

        App app = new App(5.1);
        app.download();

    }
}
