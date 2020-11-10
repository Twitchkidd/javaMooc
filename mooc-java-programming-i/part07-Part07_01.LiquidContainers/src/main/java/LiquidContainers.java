
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
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amt = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                if (amt < 0) {
                    continue;
                }
                if (first + amt <= 100) {
                    first += amt;
                } else {
                    first = 100;
                }
            }
            if (parts[0].equals("move")) {
                if (amt > first) {
                    if ((first + second) > 100) {
                        second = 100;
                    } else {
                        second += first;
                    }
                    first = 0;
                } else {
                    if ((amt + second) > 100) {
                        first -= amt;
                        second = 100;
                    } else {
                        first -= amt;
                        second += amt;
                    }
                }
            }
            if (parts[0].equals("remove")) {
                if (amt > second) {
                    second = 0;
                } else {
                    second -= amt;
                }
            }
        }
    }

}
