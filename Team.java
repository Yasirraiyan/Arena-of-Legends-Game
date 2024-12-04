public class Team {
    public String teamName;
    public String coachName;
    public int teamRank;

    public Team(String teamName, String coachName, int teamRank) {
        this.teamName = teamName;
        this.coachName = coachName;
        this.teamRank = teamRank;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCoachName() {
        return coachName;
    }

    public int getTeamRank() {
        return teamRank;
    }
}
