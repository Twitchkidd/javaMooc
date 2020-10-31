public class Item {
  private String id;
  private String name;

  public Item(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  @Override
  public boolean equals(Object compared) {
    if (compared == this) {
      return true;
    }
    if (!(compared instanceof Item)) {
      return false;
    }
    Item comparedItem = (Item) compared;
    return (comparedItem.getId().equals(this.id));
  }

  @Override
  public String toString() {
    return (this.id + ": " + this.name);
  }
}
