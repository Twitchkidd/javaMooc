
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        int smallest = list.get(0);
        for (int item : list) {
            if (item < smallest) {
                smallest = item;
            }
        }
        ArrayList<Integer> matches = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                matches.add(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < matches.size(); i++) {
            System.out.println("Found is at index " + matches.get(i));
        }
    }
}
