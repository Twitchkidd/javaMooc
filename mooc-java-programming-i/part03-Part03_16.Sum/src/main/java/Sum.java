
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> testNums = new ArrayList<>();
        testNums.add(5);
        testNums.add(4);
        testNums.add(3);
        System.out.println(sum(testNums));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int summation = 0;
        for (int number : numbers) {
            summation += number;
        }
        return summation;
    }
}
