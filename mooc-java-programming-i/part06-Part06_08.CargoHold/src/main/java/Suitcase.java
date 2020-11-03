import java.util.ArrayList;

public class Suitcase {

  private ArrayList<Item> items;
  private int maxWeight;

  public Suitcase(int maxWeight) {
    this.items = new ArrayList<>();
    this.maxWeight = maxWeight;
  }

  public int totalWeight() {
    if (this.items.isEmpty()) {
      return 0;
    }
    int returnWeight = 0;
    for (Item item : this.items) {
      returnWeight += item.getWeight();
    }
    return returnWeight;
  }

  public void addItem(Item item) {
    if ((this.totalWeight() + item.getWeight()) > this.maxWeight) {
      return;
    }
    items.add(item);
  }

  public void printItems() {
    if (this.items.isEmpty()) {
      return;
    }
    for (Item item : this.items) {
      System.out.println(item);
    }
  }

  public Item heaviestItem() {
    if (this.items.isEmpty()) {
      return null;
    }
    Item returnItem = this.items.get(0);
    for (Item item : this.items) {
      if (returnItem.getWeight() < item.getWeight()) {
        returnItem = item;
      }
    }
    return returnItem;
  }

  @Override
  public String toString() {
    if (this.items.size() == 0) {
      return ("no items (" + this.totalWeight() + " kg)");
    }
    if (this.items.size() == 1) {
      return (this.items.size() + " item (" + this.totalWeight() + " kg)");
    }
    return (this.items.size() + " items (" + this.totalWeight() + " kg)");
  }

}
