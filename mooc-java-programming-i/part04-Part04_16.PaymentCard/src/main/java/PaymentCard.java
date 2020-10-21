public class PaymentCard {
  private double balance;

  public PaymentCard(double initialBalance) {
    this.balance = initialBalance;
  }

  public void eatAffordably() {

  }

  public void eatHeartily() {

  }

  public void addMoney(double amount) {
    balance += amount;
  }

  @Override
  public String toString() {
    return ("The card has a balance of " + balance + " euros");
  }
}
