package com.sofkau.ValueOjects;

public class Balance {
    private double balance;

    public Balance() {
    }

    public Balance(double balance) {
        this.balance = balance;
    }

    public Balance increaseBalance(double credit) {
        return new Balance(this.balance + credit);
    }

    public Balance deductBalance(double debit) {
        return new Balance(this.balance - debit);
    }

}
