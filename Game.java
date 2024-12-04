public class Game 
{
    public String gameName;
    public String genre;
    public int releaseYear;

    public Game(String gameName, String genre, int releaseYear) {
        this.gameName = gameName;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getGameName() {
        return gameName;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
