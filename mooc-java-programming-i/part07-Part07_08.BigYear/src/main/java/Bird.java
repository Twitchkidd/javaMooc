public class Bird {
  private String name;
  private String nameInLatin;
  private int observations;

  public Bird(String name, String nameInLatin) {
    this.name = name;
    this.nameInLatin = nameInLatin;
  }

  public String getName() {
    return this.name;
  }

  public String getNameInLatin() {
    return this.nameInLatin;
  }

  public void addObservation() {
    this.observations++;
  }

  @Override
  public String toString() {
    return (this.name + " (" + this.nameInLatin + "): " + this.observations + " observations");
  }
}
