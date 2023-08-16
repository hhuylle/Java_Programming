package day31_inheritance.practiceTasks.statesTask;

public class States {
    /*
    statesTask:
    1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()
     */
    private String name, abbreviation, politicalParty, governor, senator;
    private long population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.isBlank() || name.isEmpty()){
            System.err.println("Name can not be nul, blank, or empty");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation==null || abbreviation.isBlank() || abbreviation.isEmpty()){
            System.err.println("Abbreviation can not be nul, blank, or empty");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty==null || politicalParty.isBlank() || politicalParty.isEmpty()){
            System.err.println("Political Party can not be nul, blank, or empty");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor==null || governor.isBlank() || governor.isEmpty()){
            System.err.println("Governor can not be nul, blank, or empty");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator==null || senator.isBlank() || senator.isEmpty()){
            System.err.println("Senator can not be nul, blank, or empty");
            System.exit(1);
        }
        this.senator = senator;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (population<=0){
            System.err.println("Invalid population: "+population);
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax<0){
            System.err.println("Invalid State Tax: "+stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
