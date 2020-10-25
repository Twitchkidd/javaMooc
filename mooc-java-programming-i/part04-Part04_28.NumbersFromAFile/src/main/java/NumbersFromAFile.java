
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try (Scanner fScanner = new Scanner(Paths.get(file))) {
            int hits = 0;
            while (fScanner.hasNextLine()) {
                int num = Integer.valueOf(fScanner.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    hits++;
                }
            }
            System.out.println("Numbers: " + hits);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
