
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int nums = 0;
        int evens = 0;
        while (true) {
            int answer = Integer.valueOf(scanner.nextLine());
            if (answer == -1) {
                break;
            }
            if (answer % 2 == 0) {
                evens++;
            }
            sum += answer;
            nums++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + nums);
        System.out.println("Average: " + ((double) sum / nums));
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + (nums - evens));
    }
}
