package ifiyemi_QAP2JAVA;

public class Money {
    private long dollars;
    private long cents;

    // Constructors
    public Money(double amount) {
        dollars = (long) amount;
        cents = (long) Math.round((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money() {
        //TODO Auto-generated constructor stub
    }

    // Add method
    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return fromCents(totalCents);
    }

    // Subtract method
    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        return fromCents(totalCents);
    }

    // CompareTo method
    public int compareTo(Money otherObject) {
        long thisCents = this.toCents();
        long otherCents = otherObject.toCents();
        return Long.compare(thisCents, otherCents);
    }

    // Equals method
    public boolean equals(Money otherObject) {
        return this.toCents() == otherObject.toCents();
    }

    // toString method
    @Override
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }

    // Helper method to convert to cents
    private long toCents() {
        return dollars * 100 + cents;
    }

    // Helper method to create Money object from cents
    private static Money fromCents(long totalCents) {
        long dollars = totalCents / 100;
        long cents = totalCents % 100;
        Money money = new Money(0);
        money.dollars = dollars;
        money.cents = cents;
        return money;
    }
}
