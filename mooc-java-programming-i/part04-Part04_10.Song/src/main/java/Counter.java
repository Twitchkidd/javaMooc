public class Counter {

  private int value;

  public Counter(int value) {
    this.value = value;
  }

  public void changeValue(int modifier) {
    this.value = this.value - modifier;
  }

  public int getValue() {
    return value;
  }

}
