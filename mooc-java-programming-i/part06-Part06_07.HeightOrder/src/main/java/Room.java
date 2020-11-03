import java.util.ArrayList;

public class Room {
  private ArrayList<Person> people;

  public Room() {
    this.people = new ArrayList<>();
  }

  public void add(Person person) {
    people.add(person);
  }

  public boolean isEmpty() {
    return this.people.isEmpty();
  }

  public ArrayList<Person> getPersons() {
    return this.people;
  }

  public Person shortest() {
    if (this.people.isEmpty()) {
      return null;
    }
    Person shortest = this.people.get(0);
    for (Person peep : this.people) {
      if (shortest.getHeight() > peep.getHeight()) {
        shortest = peep;
      }
    }
    return shortest;
  }

  public Person take() {
    if (this.people.isEmpty()) {
      return null;
    }
    Person shortest = this.shortest();
    Person returnShortest = new Person(shortest.getName(), shortest.getHeight());
    this.people.remove(shortest);
    return returnShortest;
  }
}
