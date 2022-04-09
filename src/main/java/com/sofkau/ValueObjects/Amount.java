package com.sofkau.ValueObjects;

public class Amount {
    private final int value;

    public Amount(int amount) {
        this.value = amount;
    }

    public static Amount amountOf(int amount) {
        return new Amount(amount);
    }

    public Amount increase(int debit) {
        return new Amount(this.value + debit);
    }

    public Amount decrease(int credit) {
        return new Amount(this.value - credit);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "amount=" + value +
                '}';
    }
}
