public class Fitbyte {
  private int restingHeartRate;
  private double hrMax;

  public Fitbyte(int age, int restingHeartRate) {
    this.restingHeartRate = restingHeartRate;
    this.hrMax = 206.3 - (age * 0.711);
  }

  public double targetHeartRate(double percentageOfMaximum) {
    return ((this.hrMax - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate);
  }
}
