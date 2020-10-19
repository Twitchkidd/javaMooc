public class Film {
  private String name;
  private int ageRating;

  public Film(String filmName, int filmAgeRating) {
    this.name = filmName;
    this.ageRating = filmAgeRating;
  }

  public int ageRating() {
    return ageRating;
  }

  public String name() {
    return name;
  }
}
