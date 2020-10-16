
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> sampleStrings = new ArrayList<>();
        sampleStrings.add("Hey");
        sampleStrings.add("Hi");
        sampleStrings.add("How ya dern?");
        removeLast(sampleStrings);
        for (String line : sampleStrings) {
            System.out.println(line);
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        } else {
            strings.remove(strings.size() - 1);
        }
    }
}
