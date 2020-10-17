
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean emptyEntered = false;
        String longestName = "";
        int sum = 0;
        int names = 0;
        while (!emptyEntered) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                emptyEntered = true;
                continue;
            }
            String[] parts = string.split(",");
            sum += Integer.valueOf(parts[1]);
            names++;
            if (parts[0].length() > longestName.length()) {
                longestName = parts[0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) sum / names));
    }
}
