package WednesdayLiveSession.week12.heroTask;

import java.util.ArrayList;

public class SuperHero {
    /*
    Create a class SuperHero

        declare these instance variables:
            superhero name, real name, universe, powers (ArrayList of String)
            make the universe

        create a constructor to initialize all the variables

        create an instance method:
            protect() - print $super_hero protecting

        override the toString method
     */
    private String superHeroName, realName, universe;
    private ArrayList<String> powers;

    public SuperHero(String superHeroName, String realName, ArrayList<String> powers) {
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.universe = getClass().getSimpleName();
        this.powers = new ArrayList<>(powers);
    }


    public void protect(){
        System.out.print(superHeroName+" protecting ");
    }

    @Override
    public  String toString(){
        return superHeroName+" from "+universe+". They have these powers:\n"+powers;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }
}
