
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros == compared.euros()) {
            return this.cents < compared.cents();
        }
        return this.euros < compared.euros();
    }

    public Money minus(Money decreaser) {
        int newCents = this.cents - decreaser.cents();
        int newEuros = this.euros - decreaser.euros();
        if (newCents < 0) {
            if (newEuros > 1) {
                newEuros -= 1;
                newCents = 100 + newCents;
            } else {
                return new Money(0, 0);
            }
        }
        if (newEuros < 0) {
            return new Money(0, 0);
        }
        return new Money(newEuros, newCents);
    }

}
