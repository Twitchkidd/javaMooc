
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // System.out.println(args[0]);
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();
        // register.addGradeBasedOnPoints(93);
        // register.addGradeBasedOnPoints(91);
        // register.addGradeBasedOnPoints(92);
        // register.addGradeBasedOnPoints(88);

        // System.out.println(register.averageOfGrades());
        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
