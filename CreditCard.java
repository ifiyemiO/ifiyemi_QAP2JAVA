package ifiyemi_QAP2JAVA;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0.00);
    }

    // Get balance
    public Money getBalance() {
        return this.balance;
    }

    // Get credit limit
    public Money getCreditLimit() {
        return this.creditLimit;
    }

    // Get personal information
    public String getPersonals() {
        return owner.toString();
    }

    // Charge to the credit card
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit!");
        }
    }

    // Make a payment
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}

