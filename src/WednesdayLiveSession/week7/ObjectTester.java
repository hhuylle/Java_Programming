package WednesdayLiveSession.week7;

public class ObjectTester {

    public static void main(String[] args) {

        T4Recipe recipe1 = new T4Recipe();
        recipe1.setInfo("Salmon","Salmon, lemon, pepper, salt, oliver oil",2,18.99);

        T4Recipe recipe2 = new T4Recipe();
        recipe2.setInfo("Fried eggs","Eggs, salt, pepper, oliver oil, onion",3,15.99);

        System.out.println(recipe1);
        System.out.println(recipe2);

        System.out.println("-------------------------------------------");

        SportsTeam manutd = new SportsTeam();
        manutd.setInfo("Manchester United",24,"Erik Ten Hag","25/14","England",20000000);

        System.out.println(manutd);

        for (int i = 0; i < 10; i++) {
            manutd.joinFanClub();
        }

        System.out.println(manutd);

        System.out.println("--------------------------------------------");

        MusicPlaylist maroon5 = new MusicPlaylist();
        maroon5.setInfo("Maroon 5",15,3.68,4);

        System.out.println(maroon5);

        maroon5.next();
        System.out.println(maroon5);

        maroon5.next();
        System.out.println(maroon5);

        maroon5.removeSong();
        System.out.println(maroon5);
    }
}
