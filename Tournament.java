public class Tournament
  {
    public String tournamentName;
    public int numberOfTeams;
    public String location;

    public Tournament(String tournamentName, int numberOfTeams, String location) {
        this.tournamentName = tournamentName;
        this.numberOfTeams = numberOfTeams;
        this.location = location;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public String getLocation() {
        return location;
    }
}
