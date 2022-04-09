package com.sofkau;

import com.sofkau.ValueOjects.Amount;
import com.sofkau.ValueOjects.Date;


public class Transaction {

    private Date date;
    private Amount credit;
    private Amount debit;
    private Amount balance;

    public Transaction(Date date, Amount credit, Amount debit, Amount balance) {
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", credit=" + credit +
                ", debit=" + debit +
                ", balance=" + balance +
                '}';
    }
}
