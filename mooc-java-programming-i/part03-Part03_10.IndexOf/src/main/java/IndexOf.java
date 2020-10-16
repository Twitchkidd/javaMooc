
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        System.out.print("Search for? ");
        ArrayList<Integer> matches = new ArrayList<>();
        int searchee = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (searchee == list.get(i)) {
                matches.add(i);
            }
        }
        if (!matches.isEmpty()) {
            for (int i = 0; i < matches.size(); i++) {
                System.out.println(searchee + " is at index " + matches.get(i));
            }
        }
    }
}
