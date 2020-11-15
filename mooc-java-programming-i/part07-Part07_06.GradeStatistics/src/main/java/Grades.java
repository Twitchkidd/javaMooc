import java.util.ArrayList;
import java.util.Arrays;

public class Grades {
  private int[] grades;

  public Grades(ArrayList<Integer> points) {
    this.grades = new int[6];
    for (int point : points) {
      if (point < 0 || point > 100) {
        continue;
      }
      if (point == 100) {
        grades[5]++;
        continue;
      }
      if (point >= 50) {
        grades[((point - 50) / 10) + 1]++;
        continue;
      }
      grades[0]++;
    }
  }

  @Override
  public String toString() {
    String message = "Grade distribution:";
    for (int i = 5; i >= 0; i--) {
      char star = '*';
      char[] repeat = new char[this.grades[i]];
      Arrays.fill(repeat, star);
      message += ("\n" + i + ": " + String.valueOf(repeat));
    }
    return message;
  }
}