import java.util.HashMap;

public class Abbreviations {
  private HashMap<String, String> abbrs;

  public Abbreviations() {
    this.abbrs = new HashMap<>();
  }

  public void addAbbreviation(String abbr, String full) {
    if (this.hasAbbreviation(abbr)) {
      return;
    }
    this.abbrs.put(abbr, full);
  }

  public boolean hasAbbreviation(String abbr) {
    return this.abbrs.containsKey(abbr);
  }

  public String findExplanationFor(String abbr) {
    if (!this.abbrs.containsKey(abbr)) {
      return null;
    }
    return this.abbrs.get(abbr);
  }
}
