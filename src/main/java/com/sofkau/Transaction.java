package com.sofkau;

import java.time.LocalDate;

public class Transaction {

    private LocalDate date;
    private Double balance;
    private Double credit;
    private Double debit;

    public Transaction(LocalDate date, Double balance, Double credit, Double debit) {
        this.date = date;
        this.balance = balance;
        this.credit = credit;
        this.debit = debit;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", balance=" + balance +
                ", credit=" + credit +
                ", debit=" + debit +
                '}';
    }
}
