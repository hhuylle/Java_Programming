package WednesdayLiveSession.week12.heroTask;

import java.util.ArrayList;

public class DC extends SuperHero{
    /*
    Create a class DC
        inherits SuperHero
        make DC

        declare an instance variable: city

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "DC"

        override the protect method()
            print: super_hero protecting with honor

     */
    private String city;

    public DC(String superHeroName, String realName, ArrayList<String> powers, String city) {
        super(superHeroName, realName, powers);
        this.city = city;
    }

    @Override
    public void protect() {
        super.protect();
        System.out.println("with honor");
    }
}
