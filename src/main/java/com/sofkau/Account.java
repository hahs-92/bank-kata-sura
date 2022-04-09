package com.sofkau;

import com.sofkau.ValueObjects.AccountId;
import com.sofkau.ValueObjects.Amount;
import com.sofkau.ValueObjects.Date;

import java.util.logging.Logger;


public class Account {
    private final AccountId accountId;
    private Amount balance;
    private Statement statement;
    private static final Logger LOGGER = Logger.getLogger("com.sofkau.ValueObjects.Account");

    public Account(Statement statement) {
        this.accountId = new AccountId();
        this.statement = statement;
        this.balance = new Amount(0);
    }

    void deposit(Amount amount, Date date) {
        balance = balance.increase(amount.getValue());
        statement.createTransaction(date,amount, new Amount(0), this.balance);
    }
    void withdraw(Amount amount, Date date){
        if(balance.decrease(amount.getValue()).getValue() < 0) {
            LOGGER.warning("Lo sentimos, no puedes retirar esta cantidad");
            return;
        }
        balance = balance.decrease(amount.getValue());
        statement.createTransaction(date, new Amount(0), amount, this.balance);
    }

    void printStatements() {
        statement.getTransactions().transactions
                .forEach(t ->  LOGGER.info(t.toString()));
    }
}
