public class Item {

  private String name;
  private int weight;

  public Item(String name, int weight) {
    this.name = name;
    if (weight <= 0) {
      throw new IllegalArgumentException("Items cannot weigh nothing or less than nothing.");
    }
    this.weight = weight;
  }

  public String getName() {
    return this.name;
  }

  public int getWeight() {
    return this.weight;
  }

  @Override
  public String toString() {
    return (this.name + " (" + this.weight + " kg)");
  }
}
