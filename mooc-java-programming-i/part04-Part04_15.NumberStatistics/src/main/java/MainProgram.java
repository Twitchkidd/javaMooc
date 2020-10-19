
import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        boolean exitSignalled = false;
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        while (!exitSignalled) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                exitSignalled = true;
                continue;
            }
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }
        Statistics totalStats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();
        for (int even : evens) {
            totalStats.addNumber(even);
            evenStats.addNumber(even);
        }
        for (int odd : odds) {
            totalStats.addNumber(odd);
            oddStats.addNumber(odd);
        }
        System.out.println("Sum: " + totalStats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
    }
}
