
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);
            if (amount < 0) {
                break;
            }
            // if (command.equals("add")) {
            // if ((amount + first > 100) && ((amount - first) + second > 100)) {
            // first = 100;
            // second = 100;
            // } else if ((amount + first > 100)) {
            // first = 100;
            // second += amount - first;
            // } else {
            // first += amount;
            // }
            // }
            // if (command.equals("move")) {
            // // wrong
            // // if (((first - amount) <= 0) && ((second + (amount - first)) >= 100)) {
            // // first = 0;
            // // second = 100;
            // // } else if ((first - amount) <= 0) {
            // // int firstInitialValue = first;
            // // first = 0;
            // // second += firstInitialValue;
            // // } else {
            // // first -= amount;
            // // second += amount;
            // // }
            // if (amount > first) {
            // if (second + first <= 100) {
            // second += first;
            // } else {
            // second = 100;
            // }
            // first = 0;
            // } else {
            // if (second + amount <= 100) {
            // second += amount;
            // } else {
            // second = 100;
            // }
            // first -= amount;
            // }
            // }
            // if (command.equals("remove")) {
            // if ((second - amount) < 0) {
            // second = 0;
            // } else {
            // second -= amount;
            // }
            // }
            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                }
                if (first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            }
            if (command.equals("move")) {
                if (amount > first) {
                    if ((first + second) > 100) {
                        second = 100;
                    } else {
                        second += first;
                    }
                    first = 0;
                } else {
                    if ((amount + second) > 100) {
                        first -= amount;
                        second = 100;
                    } else {
                        first -= amount;
                        second += amount;
                    }
                }
            }
            if (command.equals("remove")) {
                if (amount > second) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }
        }
    }
}
