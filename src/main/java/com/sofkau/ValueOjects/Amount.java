package com.sofkau.ValueOjects;

public class Amount {
    private int amount;


    public Amount(int amount) {
        this.amount = amount;
    }

    public static Amount amountOf(int amount) {
        return new Amount(amount);
    }

    public Amount increase(int debit) {
        return new Amount(this.amount + debit);
    }

    public Amount decrease(int credit) {
        return new Amount(this.amount - credit);
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "amount=" + amount +
                '}';
    }
}
