import java.util.ArrayList;

public class Stack {
  private ArrayList<String> list;

  public Stack() {
    this.list = new ArrayList<>();
  }

  public void printMyList() {
    System.out.println(this.list);
  }

  public boolean isEmpty() {
    return this.list.isEmpty();
  }

  public void add(String string) {
    if (!string.isEmpty()) {
      this.list.add(string);
    }
  }

  public ArrayList<String> values() {
    return this.list;
  }

  public String take() {
    return this.list.remove(this.list.size() - 1);
  }

}
