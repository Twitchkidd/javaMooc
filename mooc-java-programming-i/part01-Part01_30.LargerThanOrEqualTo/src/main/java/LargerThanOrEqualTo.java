
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int premier = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int deuxieme = Integer.valueOf(scan.nextLine());
        if (premier > deuxieme) {
            System.out.println("The greater number is " + premier);
        } else if (deuxieme > premier) {
            System.out.println("The greater number is " + deuxieme);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
