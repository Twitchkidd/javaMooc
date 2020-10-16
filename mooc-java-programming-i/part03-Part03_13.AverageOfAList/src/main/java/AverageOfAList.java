
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            inputs.add(input);
        }
        if (!inputs.isEmpty()) {
            System.out.println("Average: " + avg(inputs));
        }
    }

    public static double avg(ArrayList<Integer> list) {
        int sum = 0;
        double average = 0.0;
        for (int item : list) {
            sum += item;
        }
        average = (double) sum / list.size();
        return average;
    }
}
