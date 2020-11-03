
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return ("The collection " + this.name + " is empty.");
        }
        String message;
        if (this.elements.size() == 1) {
            message = ("The collection " + this.name + " has " + this.elements.size() + " element:");
        } else {
            message = ("The collection " + this.name + " has " + this.elements.size() + " elements:");
        }
        for (String element : this.elements) {
            message += ("\n" + element);
        }
        return message;
    }
}
