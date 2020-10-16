
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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
        // System.out.println(list.size()); // Number of elements
        // System.out.println(list.get(0)); // First element
        // System.out.println(list.get(1)); // Second element
        // System.out.println(list.get(2)); // Third element
        int greatest = list.get(0);
        for (int item : list) {
            if (item > greatest) {
                greatest = item;
            }
        }
        // for (int i = 0; i <= list.size(); i++) {
        // if (i == list.size()) {
        // if (list.get(i) > list.get(i - 1)) {
        // greatest = list.get(i);
        // }
        // continue;
        // }
        // if (list.get(i + 1) > list.get(i)) {
        // greatest = list.get(i + 1);
        // } else {
        // greatest = list.get(i);
        // }
        // }
        System.out.println("The greatest number: " + greatest);
    }
}
