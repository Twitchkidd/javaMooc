
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }
        Person comparedPerson = (Person) compared;
        if (comparedPerson.getName().equals(this.name) && comparedPerson.getBirthday().equals(this.birthday)
                && comparedPerson.getHeight() == this.height && comparedPerson.getWeight() == this.weight) {
            return true;
        }
        return false;
    }
}
