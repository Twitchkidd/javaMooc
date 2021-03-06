import java.util.ArrayList;

public class JokeManager {
  private ArrayList<String> jokes;

  public JokeManager() {
    this.jokes = new ArrayList<>();
  }

  public void addJoke(String joke) {
    this.jokes.add(joke);
  }

  public String drawJoke() {
    if (this.jokes.isEmpty()) {
      return "Jokes are in short supply.";
    }
    return this.jokes.get((int) Math.floor(Math.random() * this.jokes.size()));
  }

  public void printJokes() {
    for (String joke : this.jokes) {
      System.out.println(joke);
    }
  }

  public boolean isEmpty() {
    return this.jokes.isEmpty();
  }
}
