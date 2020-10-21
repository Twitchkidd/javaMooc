
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("First name: ");
            String first = scanner.nextLine();
            if (first.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String last = scanner.nextLine();
            System.out.print("Identification number: ");
            String id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(first, last, id));
        }
        System.out.print("\n");
        if (infoCollection.size() > 0) {
            for (PersonalInformation infoSet : infoCollection) {
                System.out.println(infoSet.getFirstName() + " " + infoSet.getLastName());
            }
        }
    }
}
