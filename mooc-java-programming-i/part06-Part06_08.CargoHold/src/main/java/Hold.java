import java.util.ArrayList;

public class Hold {
  private ArrayList<Suitcase> suitcases;
  private int maxWeight;

  public Hold(int maxWeight) {
    if (maxWeight <= 0) {
      throw new IllegalArgumentException("Holds must be able to hold something");
    }
    this.maxWeight = maxWeight;
    this.suitcases = new ArrayList<>();
  }

  private int totalWeight() {
    if (this.suitcases.isEmpty()) {
      return 0;
    }
    int returnWeight = 0;
    for (Suitcase suitcase : this.suitcases) {
      returnWeight += suitcase.totalWeight();
    }
    return returnWeight;
  }

  public void addSuitcase(Suitcase suitcase) {
    if ((this.totalWeight() + suitcase.totalWeight()) > this.maxWeight) {
      return;
    }
    this.suitcases.add(suitcase);
  }

  public void printItems() {
    if (this.suitcases.isEmpty()) {
      return;
    }
    for (Suitcase suitcase : this.suitcases) {
      suitcase.printItems();
    }
  }

  @Override
  public String toString() {
    return (this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)");
  }
}
