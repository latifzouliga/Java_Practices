package day30_Inheritance.sportTask;

public class Sport {

    private String name;
    private int numberOfPlayers, numberOfReferees;
    private String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferees, String rules) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferees(numberOfReferees);
        setRules(rules);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers <= 0){
            System.out.println("Invalid number");
            System.exit(1);
        }

        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferees() {
        return numberOfReferees;
    }

    public void setNumberOfReferees(int numberOfReferees) {
        if (numberOfReferees <= 0){
            System.out.println("Invalid number");
            System.exit(1);
        }

        this.numberOfReferees = numberOfReferees;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void play(){
        System.out.println(name + " is playing against "+ name);
    }

    public void win(){
        System.out.println(name + " won the game");
    }

    public void loose(){
        System.out.println(name+ " lost the game");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferees=" + numberOfReferees +
                ", rules='" + rules + '\'' +
                '}';
    }
}
