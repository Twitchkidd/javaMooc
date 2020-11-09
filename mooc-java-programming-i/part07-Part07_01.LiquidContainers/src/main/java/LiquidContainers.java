
import java.util.Scanner;

public class LiquidContainers {
    private static int first;
    private static int second;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("quit")) {
                break;
            }
            if (parts[0].equals("add")) {
                if (Integer.valueOf(parts[1]) < 0) {
                    break;
                }
                if (first + Integer.valueOf(parts[1]) <= 100) {
                    first += Integer.valueOf(parts[1]);
                } else {
                    if ((second + (Integer.valueOf(parts[1]) - 100)) <= 100) {
                        first = 100;
                        second += (Integer.valueOf(parts[1]) - 100);
                    } else {
                        first = 100;
                        second = 100;
                    }
                }
            }
            if (parts[0].equals("move")) {
                if (Integer.valueOf(parts[1]) < 0) {
                    break;
                }
                if (first - Integer.valueOf(parts[1] < 0) {
                    // you're supposed to continue this way and maybe pick up on function and then go on to classes
                }
            }
        }
    }

}
