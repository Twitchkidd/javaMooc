import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
  private Scanner scan;
  private ArrayList<Integer> points;

  public UserInterface(Scanner scan) {
    this.scan = scan;
    this.points = new ArrayList<>();
  }

  public ArrayList<Integer> go() {
    System.out.println("Enter point totals, -1 stops:");
    while (true) {
      Integer response = Integer.valueOf(scan.nextLine());
      if (response == -1) {
        break;
      }
      this.points.add(response);
    }
    return this.points;
  }
}
