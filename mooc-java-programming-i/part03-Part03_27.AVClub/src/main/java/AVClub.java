
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean emptyEntered = false;
        while (!emptyEntered) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                emptyEntered = true;
                continue;
            }
            String[] hits = string.split(" ");
            for (String word : hits) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
