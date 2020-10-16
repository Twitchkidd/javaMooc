
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(1, 10);
    }

    public static void divisibleByThreeInRange(int first, int second) {
        if (first == second) {
            if (first % 3 == 0) {
                System.out.println(first);
            }
            return;
        }
        int lower, higher;
        if (first > second) {
            lower = second;
            higher = first;
        } else {
            lower = first;
            higher = second;
        }
        boolean hit = false;
        while (lower <= higher) {
            while (!hit) {
                if (lower % 3 == 0) {
                    hit = true;
                } else {
                    lower++;
                }
            }
            System.out.println(lower);
            lower += 3;
        }
    }
}
