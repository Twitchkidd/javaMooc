import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(scan);
        ArrayList<Integer> results = ui.go();
        Statistics stats = new Statistics(results);
        Grades grades = new Grades(results);
        System.out.println(stats);
        System.out.println(grades);
    }
}
