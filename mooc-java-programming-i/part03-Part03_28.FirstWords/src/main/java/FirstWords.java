
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean emptyEntered = false;
        while (!emptyEntered) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                emptyEntered = true;
                continue;
            }
            String[] words = string.split(" ");
            System.out.println(words[0]);
        }
    }
}
