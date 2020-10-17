
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean emptyEntered = false;
        int oldestAge = 0;
        String oldestPerson = "";
        while (!emptyEntered) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                emptyEntered = true;
                continue;
            }
            String[] parts = string.split(",");
            if (Integer.valueOf(parts[1]) > oldestAge) {
                oldestAge = Integer.valueOf(parts[1]);
                oldestPerson = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
