package com.sofkau;

import com.sofkau.ValueOjects.AccountId;
import com.sofkau.ValueOjects.Balance;

import java.time.LocalDate;


public class Account {
    private final AccountId accountId;
    private Balance balance;
    private Statement statement;

    public Account(Statement statement) {
        this.accountId = new AccountId();
        this.statement = statement;
    }

    void deposit(String date,Double amount) {
        balance = balance.increaseBalance(amount);
        statement.createTransaction(amount, LocalDate.parse(date),amount, 0D);
    }
    void withdraw(String date, Double amount){
        balance = balance.deductBalance(amount);
        statement.createTransaction(amount, LocalDate.parse(date),0D, amount);
    }

    void printStatements() {
        statement.getTransactions().transactions.forEach(System.out::println);
    }
}
