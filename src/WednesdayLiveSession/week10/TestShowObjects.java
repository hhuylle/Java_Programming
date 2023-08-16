package WednesdayLiveSession.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class TestShowObjects {

    public static void main(String[] args) {

        // Test Show Object
        Show lastOfUs = new Show("the last of us",1,false);
        System.out.println(lastOfUs);
        lastOfUs.audioLanguages.add("English");
        System.out.println(lastOfUs);

        ArrayList<String> gotLangs = new ArrayList<>(Arrays.asList("English","Spanish","Japanese"));
        Show show1 = new Show("Game of Thrones",8,true,gotLangs);
        System.out.println(show1);

        System.out.println("----------------------------------------------------------------");

        // Test ShowTracker Objects
        ShowTracker account1 = new ShowTracker("jbong007","007secretagent",100);

        account1.trackedShows.add(lastOfUs);
        account1.trackedShows.add(show1);
        account1.trackedShows.add(new Show("family feud",24,false));
        System.out.println(account1.filter("English"));

        account1.trackedShows.add(new Show("squid game",1,false, new ArrayList<>(Arrays.asList("Korean", "english", "french", "spanish", "german"))));

        System.out.println(account1.trackedShows);
    }
}
