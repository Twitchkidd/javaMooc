
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean emptyEntered = false;
        int oldestAge = 0;
        while (!emptyEntered) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                emptyEntered = true;
                continue;
            }
            String[] parts = string.split(",");
            if (Integer.valueOf(parts[1]) > oldestAge) {
                oldestAge = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
