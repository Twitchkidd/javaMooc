
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            try {
                int num = Integer.valueOf(input);
                System.out.println((int) Math.pow(num, 3.0));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        scanner.close();
    }
}
