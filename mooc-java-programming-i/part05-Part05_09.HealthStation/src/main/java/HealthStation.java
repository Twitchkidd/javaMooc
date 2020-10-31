
public class HealthStation {
    private int weighingsVariable;

    public int weigh(Person person) {
        this.weighingsVariable++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.weighingsVariable;
    }
}
