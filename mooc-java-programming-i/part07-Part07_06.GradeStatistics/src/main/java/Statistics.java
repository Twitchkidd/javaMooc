import java.util.ArrayList;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Statistics {
  private int total;
  private int participants;
  private int passingTotal;
  private int passingParticipants;

  public Statistics(ArrayList<Integer> points) {
    this.total = 0;
    this.participants = 0;
    this.passingTotal = 0;
    this.passingParticipants = 0;
    for (int point : points) {
      if (point < 0 || point > 100) {
        continue;
      }
      this.participants++;
      this.total += point;
      if (point >= 50) {
        this.passingTotal += point;
        this.passingParticipants++;
      }
    }
  }

  private double pointAverage() {
    return (Math.round(((double) this.total / this.participants) * 10) / 10.0);
  }

  private double passingAverage() {
    return (Math.round(((double) this.passingTotal / this.passingParticipants) * 10) / 10.0);
  }

  private String passPercentage() {
    DecimalFormat decimalFormat = new DecimalFormat(".###");
    decimalFormat.setRoundingMode(RoundingMode.DOWN);
    return decimalFormat.format(((double) this.passingParticipants / this.participants * 100));
  }

  @Override
  public String toString() {
    return ("Point average (all): " + this.pointAverage() + "\nPoint average (passing): " + this.passingAverage()
        + "\nPass percentage: " + this.passPercentage());
  }
}