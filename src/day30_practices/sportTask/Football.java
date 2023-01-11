package day30_practices.sportTask;

public class Football extends Sport {

    private int numberOfGoals, numberOfWins, numberOfLoses, rank;

    public Football(String name, int numberOfPlayers, int numberOfReferees, String rules, int numberOfGoals, int numberOfWins, int numberOfLoses, int rank) {
        super(name, numberOfPlayers, numberOfReferees, rules);
        setNumberOfGoals(numberOfGoals);
        setNumberOfWins(numberOfWins);
        setNumberOfLoses(numberOfLoses);
        setRank(rank);
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfLoses() {
        return numberOfLoses;
    }

    public void setNumberOfLoses(int numberOfLoses) {
        this.numberOfLoses = numberOfLoses;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                "numberOfGoals=" + numberOfGoals +
                ", numberOfWins=" + numberOfWins +
                ", numberOfLoses=" + numberOfLoses +
                ", rank=" + rank +
                '}';
    }
}
