import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positives = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                positives.add(num);
            }
        }
        if (positives.isEmpty()) {
            System.out.println("Cannot calculate the average");
        }
        int sum = 0;
        int values = 0;
        for (int num : positives) {
            sum += num;
            values++;
        }
        System.out.println((double) sum / values);
    }
}
