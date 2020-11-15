import java.util.ArrayList;

public class Birds {
  private ArrayList<Bird> birds;

  public Birds() {
    this.birds = new ArrayList<>();
  }

  public boolean add(String name, String nameInLatin) {
    for (Bird bird : this.birds) {
      if (bird.getName().equals(name) || bird.getNameInLatin().equals(nameInLatin)) {
        return false;
      }
    }
    this.birds.add(new Bird(name, nameInLatin));
    return true;
  }

  public boolean observation(String name) {
    boolean gotIt = false;
    for (Bird bird : this.birds) {
      if (bird.getName().equals(name)) {
        bird.addObservation();
        gotIt = true;
      }
    }
    return gotIt;
  }

  public ArrayList<Bird> all() {
    return this.birds;
  }

  public Bird one(String name) {
    for (Bird bird : this.birds) {
      if (bird.getName().equals(name)) {
        return bird;
      }
    }
    return null;
  }
}
