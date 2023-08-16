package WednesdayLiveSession.week12.heroTask;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHeroes {

    public static void main(String[] args) {

        Marvel spiderMan = new Marvel("Spider Man","Peter Parker",new ArrayList<>(Arrays.asList("Enhanced strength", "Agility", "Spider-sense")));
        System.out.println(spiderMan);

        System.out.println();

        ArrayList<String> ironmanPowers = new ArrayList<>(Arrays.asList("Powered suit of armor", "Flight", "Enhanced strength"));
        Marvel ironMan = new Marvel("Iron Man","Tony Stark", ironmanPowers);
        System.out.println(ironMan);

        System.out.println();

        spiderMan.callAvengers();
        ironMan.callAvengers();

        spiderMan.protect();
        ironMan.protect();

        System.out.println(spiderMan.getRealName());
        System.out.println(ironMan.getRealName());

        System.out.println();

        spiderMan.setUniverse("Multiverse");
        System.out.println(spiderMan);

    }
}
