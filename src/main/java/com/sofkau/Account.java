package com.sofkau;

import com.sofkau.ValueOjects.AccountId;
import com.sofkau.ValueOjects.Amount;
import com.sofkau.ValueOjects.Date;


public class Account {
    private final AccountId accountId;
    private Amount balance;
    private Statement statement;

    public Account(Statement statement) {
        this.accountId = new AccountId();
        this.statement = statement;
        this.balance = new Amount(0);
    }

    void deposit(Amount amount, Date date) {
        balance = balance.increase(amount.getAmount());
        statement.createTransaction(date,amount, new Amount(0), this.balance);
    }
    void withdraw(Amount amount, Date date){
        balance = balance.decrease(amount.getAmount());
        statement.createTransaction(date,new Amount(0), amount, this.balance);
    }

    void printStatements() {
        statement.getTransactions().transactions.forEach(System.out::println);
    }
}
