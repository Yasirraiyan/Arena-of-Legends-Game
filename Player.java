 public class Player
    {
    public String name;
    public int level;
    public int score;
    public boolean isActive;

    public Player(String name, int level, int score, boolean isActive) {
        this.name = name;
        this.level = level;
        this.score = score;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public boolean getIsActive() {
        return isActive;
    }
}
