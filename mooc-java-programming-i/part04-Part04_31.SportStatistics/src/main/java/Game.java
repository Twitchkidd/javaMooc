
public class Game {

  private String team1;
  private String team2;
  private int score1;
  private int score2;

  public Game(String team1, String team2, int score1, int score2) {
    this.team1 = team1;
    this.team2 = team2;
    this.score1 = score1;
    this.score2 = score2;
  }

  public String[] getTeams() {
    String[] teams = { team1, team2 };
    return teams;
  }

  public String getWinner() {
    // "You may assume games can't be tied."
    if (score1 > score2) {
      return team1;
    } else {
      return team2;
    }
  }

}
