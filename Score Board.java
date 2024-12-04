public class Scoreboard
  {
    public String playerName;
    public int playerScore;
    public int rank;

    public Scoreboard(String playerName, int playerScore, int rank) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.rank = rank;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getRank() {
        return rank;
    }
}
