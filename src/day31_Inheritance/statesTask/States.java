package day31_Inheritance.statesTask;

public class States {

    private String name, abbreviations, politicalParty, governor, senators;
    private int population;
    private double stateTax;


    public States() {
        setName(name = "Unknown");
        setAbbreviations(abbreviations = "Unknown");
        setPoliticalParty(politicalParty = "Unknown");
        setGovernor(governor = "Unknown");
        setSenators(senators = "Unknown");
        setPopulation(population = 9999);
        setStateTax(stateTax = 9999);
    }

    public States(String name, String abbreviations, String politicalParty, String governor, String senators, int population, double stateTax) {
        setName(name);
        setAbbreviations(abbreviations);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenators(senators);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    // check if a name is empty or blank
    public void setName(String name) {

        boolean isValid = checkName(name);
        if(!isValid){
            System.err.println("Name is empty or blank");
            System.exit(1);
        }

        this.name = name;
    }

    // check if abbreviations string isEmpty or isBlank
    private boolean checkName(String name) {
        boolean isEmptyOfBlank = name.isEmpty() || name.isBlank();

        if (isEmptyOfBlank){
            return false;
        }else
            return true;

    }

    public String getAbbreviations() {
        return abbreviations;
    }

    public void setAbbreviations(String abbreviations) {

        boolean isValid = checkName(abbreviations);
        if (!isValid){
            System.err.println("State abbreviations is empty or blank");
            System.exit(1);
        }

        this.abbreviations = abbreviations;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    // check if Political party string is empty or blank
    public void setPoliticalParty(String politicalParty) {

        boolean isValid = checkName(politicalParty);

        if (!isValid){
            System.err.println("Political party is empty or blank");
            System.exit(1);
        }

        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    // check if governor string is empty or blank
    public void setGovernor(String governor) {

        boolean isValid = checkName(governor);
        if (!isValid){
            System.err.println("Governor is empty or blank");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenators() {
        return senators;
    }

    // check if senators string is empty or blank
    public void setSenators(String senators) {

        boolean isValid = checkName(senators);

        if (!isValid){
            System.err.println("Senators is empty or blank");
            System.exit(1);
        }
        this.senators = senators;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {

        if (population <= 0){
            System.err.println("Invalid number. Population can not zero or negative number");
            System.exit(1);
        }

        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviations='" + abbreviations + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senators='" + senators + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
statesTask:
    1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. taxRate can not be negative
                            3. Population can not be zero or negative

            Methods:
                toString()

    2. Create the following sub classes of States and add any additional fields and methods if necessary:
                1. Virginia
                2. California
                3. Texas
                4. Florida


    3. Create a class named StateObjects
                    Create the objects of each sub classes

                    test all the functions of each objects

                    Analyze the relationships between the classes

 */
