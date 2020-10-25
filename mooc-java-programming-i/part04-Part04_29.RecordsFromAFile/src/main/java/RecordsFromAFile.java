
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner fScanner = new Scanner(Paths.get(file))) {
            while (fScanner.hasNextLine()) {
                String personData = fScanner.nextLine();
                String[] person = personData.split(",");
                if (Integer.valueOf(person[1]) == 1) {
                    System.out.println(person[0] + ", age: " + person[1] + " year");
                } else {
                    System.out.println(person[0] + ", age: " + person[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
